package com.perScholas.pa303Array;

import java.util.Arrays;

public class SwapElementTask8 {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "carrot", "donut","egg"};
        String temp = strArray[0];
        strArray[0] =  strArray[2];
        strArray[2] = temp;
        System.out.println(Arrays.toString(strArray));
    }
}
