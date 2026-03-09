public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car - Start the engine");
    }

    public void drive(){
        System.out.println("Car - Drive the car" + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car - Run the engine");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Car - Gas powered car StartEngine %d %n cylinders", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Car - Gas powered car runEngine %.2f %n cylinders", avgKmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric Car - Gas powered car StartEngine %d %n batterySize", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electirc Car - Gas powered car runEngine %.2f %n avgKmPerCharge", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid Car - Gas powered car StartEngine %d %n cylinders", cylinders);
        System.out.printf("Hybrid Car - Gas powered car StartEngine %d %n batterySize", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Car - Gas powered car runEngine %.2f %n cylinders", avgKmPerLitre);
    }
}
