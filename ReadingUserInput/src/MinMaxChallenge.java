import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;
        while (true) {
            System.out.println("Enter number a number or character" );
            String nextNumber = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextNumber);
                if ((loopCount ==0) || (validNum < min)) {
                    min = validNum;
                }
                if ((loopCount ==0) || (validNum > max)) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Min value is "+ min + " Max value is " + max);
        } else {
            System.out.println("No valid data" );
        }
    }
}
