public class Main {
    public static void main(String[] args) {
        House bluseHouse = new House("blue");
        House anotherHouse = bluseHouse;

        System.out.println(bluseHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("red");
        System.out.println(bluseHouse.getColor());
        System.out.println(anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(bluseHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());
    }
}
