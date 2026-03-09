public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Honda ");
        car.setColor("White");
        car.setModel("Accord");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("Make = "+ car.getMake());
        System.out.println("Model = "+ car.getModel());
        System.out.println("Color = "+ car.getColor());
        car.describeCar();
    }
}
