public class Main {
//    public static void main(String[] args) {
//        int newScore = calculateScore("Tim" , 500);
//        System.out.println("NewScore is " + newScore);
//        int unNamedNewScore = calculateScore(100);
//        System.out.println("Unnamed players newScore is " + unNamedNewScore);
//        calculateScore();
//    }
//
//    public static int calculateScore (String playerName, int score) {
//        System.out.println("Player " + playerName + "scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore (int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore () {
//        System.out.println("No player " + ", " + "No points");
//        return 0;
//    }
    public static void main(String[] args) {
        double convertedCM = 0.0;
        convertedCM = convertToCentimeters (10);
        System.out.println("Converted from Inches to CM value is " + convertedCM);
        convertedCM = convertToCentimeters (5, 10);
        System.out.println("Converted from Feet and Inches to CM value is " + convertedCM);
    }
    public static double convertToCentimeters (int heightInInches) {
        double convertedCM = 0.0;
        convertedCM = (double) (heightInInches * 2.54);
        return convertedCM;
    }
    public static double convertToCentimeters (int heightInFeets, int heightInInches) {
        double convertedCM, convertedCM1, convertedCM2 = 0.0;
        convertedCM1 = (double) (heightInFeets * 12);
        convertedCM2 = convertToCentimeters (heightInInches);
        convertedCM = convertedCM1 + convertedCM2;
        return convertedCM;
    }



}
