public class Challenge {
    public static void main(String[] args) {
        int number1 = 5;
        int countOdd = 0;
        int countEven = 0;
        while (number1 <= 20) {
            if (isEvenNumber(number1)) {
                System.out.println(number1 + " _ ");
                countEven ++ ;
            }
            else {
                countOdd ++ ;
            }
            if (countEven >= 5) {
                break;
            }
            number1++;
        }
        System.out.println("Total odd numbers : " + countOdd + " Total Even numbers : " + countEven  );
    }
    public static boolean isEvenNumber (int number) {
        if (number %2 ==0) {
            return true;
        }
        else {
            return false;
        }
    }

}
