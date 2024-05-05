package com.perScholas.codingchallenge.stringArithmetic;

import java.util.Arrays;
/*Given a String with numbers. Break the array into four even parts. Subtract the first part of the numbers. Divide the 2nd part of numbers. Multiply the third  part and finally add the last.  Print the total for each part.

The length of the string will be divisible by 8.  Ex 8 ,16 ,32...

Ex 37463738

Part 1 = 3-7 = -4

Part 2 = 4/6=  0.66

Part 3 = 3*7=  21

Part 4 = 3+8= 11*/
public class StringArithmetic {
    public static void main(String[] args) {

        String strNum = "37463738";

//        String[] strArray = new String[strNum.length()/2];
        String[] strArray = new String[4];
//        int j = 0;

        for (int i = 0; i < strNum.length(); i += 2) {
//          System.out.println(strNum.substring(i, i+2));
//          strArray[j++] = strNum.substring(i, i+2);
            strArray[i / 2] = strNum.substring(i, i + 2);
        }
        Arrays.toString(strArray);
        String str = strArray[0];
        int difference = str.charAt(0) - str.charAt(1);
        System.out.println(difference);

        str = strArray[1];
        float division = (float) (str.charAt(0) - '0') / (str.charAt(1) - '0');

        int value = (int) (division * 100);
        division = value / 100f;
        System.out.println(division);

        str = strArray[2];
        int multiply = (str.charAt(0) - '0') * (str.charAt(1) - '0');
        System.out.println(multiply);

        str = strArray[3];
        int add = (str.charAt(0) - '0') + (str.charAt(1) - '0');
        System.out.println(add);

        /* Solved with different way*/

        for (int i = 0; i < strArray.length; i++) {
            int d1 = strArray[i].charAt(0) - '0';
            int d2 = strArray[i].charAt(1) - '0';

            switch (i) {
                case 0:
                    int subtraction = d1 - d2;
                    System.out.println(subtraction);
                    break;
                case 1:
                    float div = (float) d1 / d2;
                    int value1 = (int) (div * 100);
                    div = value1 / 100f;
                    System.out.println(div);
                    break;
                case 2:
                    int multiplication = d1 * d2;
                    System.out.println(multiplication);
                    break;
                case 3:
                    int addition = d1 + d2;
                    System.out.println(addition);
            }
        }
    }

}

/**
 * Output:
 * -4
 * 0.66
 * 21
 * 11
 */