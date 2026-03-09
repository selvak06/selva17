package dev.tpa;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +" track");
    }
}
