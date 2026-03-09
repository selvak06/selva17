package dev.tpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println("new Array"+ Arrays.toString(array2));
        System.out.println("Array Length"+ array2.length);

        for (int[] outer: array2) {
            System.out.println("outer Array"+ Arrays.toString(outer));
        }

        for (int i = 0; i <array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j <innerArray.length; j++) {
                System.out.println(array2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
