public class Car {
    private String make = "Tesla";
    private String model = "model X";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible;

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getMake () {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake (String make) {
        this.make = make;
    }
    public void describeCar() {
        System.out.println(doors + "- Doors " +
            make + " " +
            model + " " +
            color + " " +
            (convertible? "Convertible": " "));
    }
}
