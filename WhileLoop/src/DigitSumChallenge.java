public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of digits is " + sumDigits(1234));
    }
    public static int sumDigits(int number) {
        int finalNum = 0;
        if (number < 0 ){
            return -1;
        } else {
            while (number > 9) {
                finalNum += (number % 10);
                number = number / 10;
            }
            finalNum += number;
            return finalNum;
        }
    }
}
