public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Accord");
        runRace(car);

        Car ferrai = new GasPoweredCar("Ferrai", 15.4, 6);
        runRace(ferrai);

        Car ferrai1 = new ElectricCar("Ferrai1", 15, 6);
        runRace(ferrai1);

        Car ferrai2 = new HybridCar("Ferrai2", 20, 15, 6);
        runRace(ferrai2);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
