public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog =new Dog();
        doAnimalStuff(dog, "fast");

        Dog yo = new Dog ("Yo", 15);
        doAnimalStuff(yo ,"fast");

        Dog retr = new Dog ("Retriver" , 65, "Floopy", "Swimmer" );
        doAnimalStuff(retr, "medium");

        Dog wolf = new Dog ("Wolf", 15);
        doAnimalStuff(wolf ,"slow");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie ,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----");
    }
}
