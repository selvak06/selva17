public class Main {
    public static void main(String[] args) {
//        for (int counter=1; counter <=5; counter++){
//            System.out.println(counter);
//        }
//        for (double rate=1; rate <=5; rate++){
//            double principalAmount = 10000;
//            System.out.println("Calculate Interest for 10000 at 2% " + calculateInterest(principalAmount, rate));
//        }
        for (double rate=7.5; rate <= 10; rate=(rate + 0.25)){
            double principalAmount = 100;
            double interestAmount = calculateInterest(principalAmount, rate);
            if ( rate > 8.5) {
                break;
            }
            System.out.println("Calculate Interest for 100 " + interestAmount );
        }
    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
