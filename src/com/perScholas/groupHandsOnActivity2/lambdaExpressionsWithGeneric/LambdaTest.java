package com.perScholas.groupHandsOnActivity2.lambdaExpressionsWithGeneric;

public class LambdaTest {
    public void printLength(String s) {
        //GroupOneFunctionalInterface<String, Integer> transformer = String::length;
        GroupOneFunctionalInterface<String, Integer> transformer = input -> input.length();
        int num = transformer.transform(s);
        System.out.println("The length is: " + num);
    }
}
