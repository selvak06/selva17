public class Challenge {
   public static void main(String[] args) {
       double firstVar = 20.00;
       double secondVar = 80.00;
       double totalVar, totalVar1 = 0;
       totalVar = (firstVar + secondVar) * 100;
       totalVar1 = totalVar %= 45;
       boolean result = (totalVar1 == 0) ? true : false;
       System.out.println("The result is " + result);
       if (!result) {
           System.out.println("It is a remainder");
       }
   }
  }
