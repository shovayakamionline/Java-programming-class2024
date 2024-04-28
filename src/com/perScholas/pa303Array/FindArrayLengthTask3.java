package com.perScholas.pa303Array;

import java.util.Arrays;

public class FindArrayLengthTask3 {
    public static void main(String[] args) {
        String[] strArray = {"red", "green", "blue", "yellow"};
        System.out.println("Length of the string array: " + strArray.length);
        String[] strArrayClone = strArray.clone();
        System.out.println("Clone array is: " + Arrays.toString(strArrayClone));
    }
}
