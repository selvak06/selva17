public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if ( value == 1) {
//            System.out.println ("value was 1");
//        } else if ( value == 2) {
//            System.out.println ("value was 2");
//        } else {
//            System.out.println ("Was not 1 or 2");
//        }
//    }
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("value was 3 or 4 or 5");
//                System.out.println("Actual value was "+ switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
//                break;
//        }
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1 -> System.out.println("value was 1");
//            case 2 -> System.out.println("value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("value was 3 or 4 or 5");
//                System.out.println("Actual value was " + switchValue);
//            }
//            default -> System.out.println("Was not 1 or 2 or 3 or 4 or 5");
//        }
//        char natoPhAl = 'F';
//        switch (natoPhAl) {
//            case 'A' -> System.out.println("NATO phonetic value for A is Able");
//            case 'B' -> System.out.println("NATO phonetic value for B is Baker");
//            case 'C' -> System.out.println("NATO phonetic value for C is Charlie");
//            case 'D' -> System.out.println("NATO phonetic value for D is Dog");
//            case 'E' -> System.out.println("NATO phonetic value for E is Easy");
//            default -> {
//                System.out.println("NATO phonetic value is not found for this charcter " + natoPhAl);
//            }
//        }
        int[] weekDay = {0, 1, 2, 3, 4, 5, 6};
        for (int i = 0; i < weekDay.length; i++) {
            printDayOfWeek(i);
            printWeekDay(i);
        }
    }

    private static void printDayOfWeek(int num) {
        switch (num) {
            case 0 -> System.out.println("The day of the Week is Sunday" + " for " + num);
            case 1 -> System.out.println("The day of the Week is Monday" + " for " + num);
            case 2 -> System.out.println("The day of the Week is Tuesday" + " for " + num);
            case 3 -> System.out.println("The day of the Week is Wednesday" + " for " + num);
            case 4 -> System.out.println("The day of the Week is Thursday" + " for " + num);
            case 5 -> System.out.println("The day of the Week is Friday" + " for " + num);
            case 6 -> System.out.println("The day of the Week is Saturday" + " for " + num);
            default -> {
                System.out.println("The day is not found for " + num);
            }
        }
    }

    private static void printWeekDay(int num) {
        if (num == 0) {
            System.out.println("If : The day of the Week is Sunday" + " for " + num);
        } else if (num == 1) {
            System.out.println("If : The day of the Week is Sunday" + " for " + num);
        } else if (num == 2) {
            System.out.println("If :The day of the Week is Sunday" + " for " + num);
        } else if (num == 3) {
            System.out.println("If : e day of the Week is Sunday" + " for " + num);
        } else if (num == 4) {
            System.out.println("If: The day of the Week is Sunday" + " for " + num);
        } else if (num == 5) {
            System.out.println("If : The day of the Week is Sunday" + " for " + num);
        } else if (num == 6) {
            System.out.println("If: The day of the Week is Sunday" + " for " + num);
        } else{
            System.out.println("If: The day is not found for " + num);
        }
    }
}
