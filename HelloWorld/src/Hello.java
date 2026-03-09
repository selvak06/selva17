public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, Tim!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not alien!");
            System.out.println("I am not an alien!");
        }

        int topScore = 100;
        if (topScore >= 100){
            System.out.println("It is the top score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 110)) {
            System.out.println("It is the Greater than second top score and less than top score!");
        }

        if ((topScore > secondTopScore) || (topScore < 110)) {
            System.out.println("It is the Greater than second top score or less than top score!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("It is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("It is again an error");
        }

        String makeOfCar = "Ford";
        boolean isLocal = makeOfCar == "Ford"? true : false ;

        if (isLocal) {
            System.out.println("It is domestic car");
        }

        int ageOfClient = 10;
        String  ageText = ageOfClient >= 18 ? "Adult " : "Kid" ;
        System.out.println("Our Client is a " + ageText);


    }
}
