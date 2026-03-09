import java.util.Scanner;

public class ReadInputChallege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (counter < 5) {
            System.out.println("Enter number # " + counter + ":" );
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum+= number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
            System.out.println("The Sum of 5 numbers is " + sum);
        }
    }

}
