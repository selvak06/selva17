package dev.tpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "big" , 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Wolf1 ", "big" , 150));
        animals.add(new Fish("GoldFish ", "small" , 10));
        animals.add(new Fish("Fish2 ", "big" , 75));
        animals.add(new Dog("Wolf2 ", "small" , 20));

        animals.add(new Horse("Horse1 ", "big" , 2000));

        for (Animal animal: animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMaammal) {
                currentMaammal.shedHair();
            }
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }

}
