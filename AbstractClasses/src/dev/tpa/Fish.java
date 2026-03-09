package dev.tpa;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (type == "slow") {
            System.out.println(getExplicitType()+ "lazily swimming!");
        } else {
            System.out.println(getExplicitType() + "darting!");
        }
    }

    @Override
    public void makeNoise() {
       if (type == "Goldfish") {
           System.out.println("Swish!");
       } else {
           System.out.println("Flash!");
       }
    }
}
