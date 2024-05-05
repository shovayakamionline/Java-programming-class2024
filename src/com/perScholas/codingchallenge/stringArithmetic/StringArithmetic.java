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
        int partCount = strNum.length()/4;
        String[] strArray = new String[4];

        for (int i = 0; i < strNum.length(); i += partCount) {
            strArray[i / partCount] = strNum.substring(i, i + partCount);
        }
 /*--------------Subtraction-------------------*/
        String str = strArray[0];
        int firstDigit = str.charAt(0)-'0';
        int difference = firstDigit;
        for (int i = 1; i < partCount; i++) {
            difference -= (str.charAt(i) - '0');
        }
        System.out.println(difference);

/*--------------divide-------------------*/
        str = strArray[1];
        firstDigit = str.charAt(0) - '0';
        float division = firstDigit;
        for (int i = 1; i < partCount; i++) {
            division = division / (str.charAt(i) - '0');
        }
        int value = (int) (division * 100);
        division = value / 100f;
        System.out.println(division);

 /*--------------multiplication-------------------*/
        str = strArray[2];
        firstDigit = (str.charAt(0) - '0');
        int multiply = firstDigit;
        for (int i = 1; i < partCount; i++) {
            multiply *= (str.charAt(i) - '0');
        }
        System.out.println(multiply);

/*--------------Addition-------------------*/

        str = strArray[3];
        firstDigit = (str.charAt(0) - '0');
        int add = firstDigit;
        for (int i = 1; i < partCount ; i++) {
            add += (str.charAt(i) - '0');
        }
        System.out.println(add);
    }

}

/**
 * Output:
 * -4
 * 0.66
 * 21
 * 11
 */