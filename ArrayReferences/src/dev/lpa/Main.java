package dev.lpa;

public class Main {
//    public static void main(String[] args) {
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//
//        System.out.println("myIntArray" + Arrays.toString(myIntArray));
//        System.out.println("anotherArray" + Arrays.toString(anotherArray));
//
//        anotherArray[0] = 1;
//        modifyArray(myIntArray);
//
//        System.out.println("myIntArray after change" + Arrays.toString(myIntArray));
//        System.out.println("anotherArray after change" + Arrays.toString(anotherArray));
//    }
//
//    private static void modifyArray (int[] array) {
//        array[1] = 2;
//    }
    public static void main(String... args) {
        System.out.println("myIntArray" );

        String[] splitStrings = "Hello world again" .split("");
        modifyString(splitStrings);

        System.out.println("-".repeat(20) );
        modifyString("Hello");

        System.out.println("-".repeat(20) );
        modifyString("Hello", "world", "again");

        System.out.println("-".repeat(20) );
        modifyString("");

        String[] sArray = {"Hello", "world", "again"};
        System.out.println(String.join(",", sArray) );

    }
    private static void modifyString (String... textList) {
        for(String t: textList){
            System.out.println(t);
        }
    }
}
