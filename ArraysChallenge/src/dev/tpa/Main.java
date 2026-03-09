package dev.tpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] sortedArray = sortIntegers(firstArray);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] getRandomArray (int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i =0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
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


