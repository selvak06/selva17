package dev.tpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
};

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<Place>();
        Place adelide = new Place( " Adelide", 1374);
        placesToVisit.add(adelide);
        addPlace(placesToVisit, new Place(" Brisbane", 917));
        addPlace(placesToVisit, new Place(" Perth", 3923));
        addPlace(placesToVisit, new Place(" Alice Springs", 2771));
        addPlace(placesToVisit, new Place(" Darwin", 3972));
        addPlace(placesToVisit, new Place(" Melbourne", 877));

        placesToVisit.addFirst(new Place(" Sydney",0));
        System.out.println("Place " + placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quiteLoop = false;
        boolean forward = true;

        printMenu();

        while(!quiteLoop){
            System.out.println("Enter value: ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.isEmpty()) {
                continue; // or ask again
            }
            String menuItem = input.substring(0, 1);
            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    } else {
                        System.out.println("Final " + placesToVisit.getLast());
                        quiteLoop = true;
                    }
                    break;
               case "B":
                    System.out.println("User wants to go backward");
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    } else {
                        System.out.println("Originating " + placesToVisit.getFirst());
                        quiteLoop = true;
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quiteLoop = true;
                    break;
            }
        }

    }
    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Found duplicate " + place);
            return;
        }

        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace: list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        String textBlock = """
                Available actions (select word or Letter):
                
                (F)orward
                
                (B)ackward
                
                (L)istPlaces
                
                (M)enu
                
                (Q)uit""";
        System.out.println(textBlock + " ");
    }
}
