package com.perScholas.pa303Array;

import java.sql.Array;
import java.util.Arrays;

public class AscendingOrderTask9 {
    public static void main(String[] args) {
        int[] intArray = {4, 2, 9, 13, 1, 0};
        Arrays.sort(intArray);
        System.out.println("Array in ascending order: " + Arrays.toString(intArray));
        System.out.println("The smallest number is " + intArray[0]);
        System.out.println("The biggest number is " + intArray[intArray.length-1]);
    }
}
