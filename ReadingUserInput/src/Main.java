import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2026;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi" + name + " thanks for taking the course");
        System.out.println("Hi, What year you were born? ");
        boolean validDOB = false;
        int age =0;

        do {
            System.out.println("Enter year of birth  >= " + (currentYear- 125) + " and <= " + (currentYear));
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false: true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Bad User Data");
            }
        } while (!validDOB);
        return "Hi" + name + " your age is " + age;
    }

    public static String getInputFromConsole(int currentYear) {
        String name =System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi" + name + " thanks for taking the course");
        String dateOfBirth =System.console().readLine("Hi, What year you were born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("Hi" + name + " your age is " + age);
        return dateOfBirth;
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear- 125;
        if ((dob < minimumYear) || (dob > currentYear)) {
            return - 1;
        }
        return (currentYear- dob);
    }
}
