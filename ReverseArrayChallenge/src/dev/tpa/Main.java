package dev.tpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println("Entered Array is " + Arrays.toString(returnedArray));

        int[] reverseArray = sortIntegers(returnedArray);
        System.out.println("Reversed Array is " + Arrays.toString(reverseArray));

    }
    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integers");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i =0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i =0; i < sortedArray.length -1; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
