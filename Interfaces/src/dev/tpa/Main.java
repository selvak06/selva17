package dev.tpa;

public class Main {
    private static double kmsTravelled;

    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable track = bird;

//        animal.move();
//        flier.takeOff();
//        flier.land();
//        flier.fly();
//        track.track();
//        inFligt(flier);
//        inFligt(new Jet());
//        Trackable truck = new Truck();
//        truck.track();
        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The Truck travelled = %.2f km or %.2f miles%n", kmsTravelled, milesTravelled);
    }

    public static void inFligt(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable track) {
            track.track();
        }
        flier.land();
    }
}
