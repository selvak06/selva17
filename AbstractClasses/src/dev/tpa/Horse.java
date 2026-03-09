package dev.tpa;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the Spring");
    }

    @Override
    public void makeNoise() {

    }
}
