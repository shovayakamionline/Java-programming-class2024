package com.perScholas.glab1genericMethodAndClass;

//Example: Java Generics Method
public class DemoClass {

    // create a Generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

}
