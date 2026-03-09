public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++){
//            Student s = new Student("S92300" + i ,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymus";
//                    },
//                    "05/14/2006",
//                    "Mastering Java Clss");
//            System.out.println(s);
//        }

        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i ,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymus";
                    },
                    "05/14/2006",
                    "Mastering Java Clss");
            System.out.println(s);
        }

    }
}
