package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thridArray = getRandomArray(10);
        System.out.println(Arrays.toString(thridArray));

        int[] fourthArray = Arrays.copyOf(thridArray, thridArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thridArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thridArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thridArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0 ){
            System.out.println("Found Mark");
        }

        int[] s1 = { 1, 2, 3, 4, 5};
        int[] s2 = { 5, 2, 3, 4, 1};
        if (Arrays.equals(s1, s2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }

    public static int[] getRandomArray (int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i =0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
