package com.perScholas.glabHashmapAndTreemapProcessing;

import java.util.TreeMap;

//Example One: Remove TeeMap Elements.
public class ExampleTreeMapOne {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);
    }
}

/*Output:
TreeMap: {One=1, Three=3, Two=2}
Removed value: 2
Is the entry {Three=3} removed? true
Updated TreeMap: {One=1}
*/