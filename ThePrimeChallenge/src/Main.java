public class Main {
    public static void main(String[] args) {
        boolean checkPrime = false;
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            checkPrime = isPrime(i);
            if (checkPrime) {
                counter++;
                if (counter > 3) {
                    break;
                }
                System.out.println(i + " is a prime number");
            }
        }
    }
    public static boolean isPrime (int wholeNumber){
        if (wholeNumber < 2) {
                return false;
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                    return false;
            }
        }
        return true;
    }
}
