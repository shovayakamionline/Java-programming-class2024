package com.perScholas.PracticeSBA1;

import java.util.Arrays;

public class PrintIndividualDigit {
    public static void main(String[] args) {
        String s = "597";
        String s1 = "824";
        printDigitUsingChar(s);
        printDigitsUsingString(s);
        divisionDigits(s1);
        subtractDigits(s1);
        subtractDigitUsingChar(s1);
        divisionDigitUsingChar(s1);
    }

    private static void divisionDigitUsingChar(String s1) {
        int answer =(s1.charAt(0)-'0')/(s1.charAt(1)-'0');
        System.out.println(answer);
        for (int i = 2; i < s1.length(); i++) {
            answer= answer/(s1.charAt(i)-'0');
        }
        System.out.println("answer = "  + answer);
    }

    private static void subtractDigitUsingChar(String s1) {
        int answer = s1.charAt(0) - s1.charAt(1);
        for (int i = 2; i < s1.length(); i++) {
            answer = answer - (s1.charAt(i)- '0');
            System.out.println(answer);
        }
    }

    private static void subtractDigits(String s1) {
        String[] strArray = s1.split("");
        int answer = Integer.parseInt(strArray[0])-Integer.parseInt(strArray[1]);
        for (int i = 2; i < strArray.length; i++) {
            answer -= Integer.parseInt(strArray[i]);
        }
        System.out.println(answer);
    }

    private static void divisionDigits(String s1) {
       String[] strArray = s1.split("");
        System.out.println("User input is: " + Arrays.toString(strArray));
        int answer = Integer.parseInt(strArray[0])/Integer.parseInt(strArray[1]);
        System.out.println("answer " + answer);
        for (int i = 2; i < strArray.length ; i++) {
            answer = answer/Integer.parseInt(strArray[i]);
        }
        System.out.println("answer " + answer);
    }

    private static void printDigitUsingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Number "+ (i +1)+ " is " + s.charAt(i));
        }
    }

    private static void printDigitsUsingString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Number "+ (i +1)+ " is " + s.substring(i,i+1));
        }
    }
}
