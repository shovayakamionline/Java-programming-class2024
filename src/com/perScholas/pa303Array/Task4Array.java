package com.perScholas.pa303Array;

public class Task4Array {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        numArray[0] = 5;
        numArray[1] = 12;
        numArray[2] = 9;
        numArray[3] = 10;
        numArray[4] = 3;


        System.out.println("First index of numArray is: " + numArray[0]);
        System.out.println("Last index of numArray is: " + numArray[numArray.length-1]);
       // System.out.println(numArray[numArray.length]); //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
         numArray[5] = 20; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //at com.perScholas.pa303Array.Task4Array.main(Task4Array.java:15)
    }
}
