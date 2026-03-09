package dev.tpa;

interface OrbitEarth extends FlightEnabled{
    public default void achieveOrbit() {
        System.out.println("orbit achieved");
    }
}

interface FlightEnabled {
   double MILES_TO_KM = 1.60934;
   double KM_TO_MILES = 0.621371;
   void takeOff();
   void land();
   void fly();
};

interface Trackable{
    void track();
};

public abstract class Animal {
    public abstract void move();
}
