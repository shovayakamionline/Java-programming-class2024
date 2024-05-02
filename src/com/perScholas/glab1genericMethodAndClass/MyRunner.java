package com.perScholas.glab1genericMethodAndClass;

public class MyRunner {
    public static void main(String[] args) {

// initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char


        // initialize generic class
        // with String and Integer data

        GMultipleDataType<String, Integer> mObj = new GMultipleDataType("Per Scholas", 11025);

        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDataType<String, String> mObj2 = new GMultipleDataType("Per Scholas", "Non profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }

}
/*Output:
Generics Method:
Data Passed: 25
Generics Method:
Data Passed: Per Scholas
Generics Method:
Data Passed: 2563.5
Generics Method:
Data Passed: H
*/

/*Output:
Per Scholas
11025
Per Scholas
Non profit*/