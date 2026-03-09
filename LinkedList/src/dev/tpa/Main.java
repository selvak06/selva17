package dev.tpa;

import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Dublin");
        placesToVisit.add(0, "Pleasonton");
        System.out.println("Places to visit" + placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println("Places to visit after add" + placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println("Places to visit after add" + placesToVisit);
//        gettingElements(placesToVisit);
//        printItenary3(placesToVisit);
        testIterator2(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list){
        list.add("Fremont");
        list.add("livermore");

        list.offer("SanJose");
        list.offerFirst("Milpitas");
        list.offerLast("Union city");
        list.push("Cupertino");

    }

    private static void removeElements(LinkedList<String> list){
        list.remove("Fremont");
        list.remove("livermore");

        list.removeFirst();
        list.removeLast();
        list.pop();

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrived Element = " + list.get(4));
        System.out.println("Retrived Element = " + list.getFirst());
        System.out.println("Retrived Element = " + list.getLast());
        System.out.println("Retrived Element = " + list.indexOf("Fremont"));
        System.out.println("Retrived Element = " + list.element());
        System.out.println("Retrived Element = " + list.peek());
        System.out.println("Retrived Element = " + list.peekFirst());
        System.out.println("Retrived Element = " + list.peekLast());

    }
    private static void printItenary3(LinkedList<String> list){
        System.out.println("Trip Starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("---> From: = " + previousTown + " To: " +town);
            previousTown=town;
        }
        System.out.println("Trip Ends at = " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("---> From: = " + iterator.next() );
        }
        System.out.println(list);
    }

    private static void testIterator2(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println("---> From: = " + iterator.next() );
        }
        System.out.println(list);
    }
}
