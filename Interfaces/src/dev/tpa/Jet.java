package dev.tpa;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() +" takeOff");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " land");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() +" fly");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +" track");
    }
}
