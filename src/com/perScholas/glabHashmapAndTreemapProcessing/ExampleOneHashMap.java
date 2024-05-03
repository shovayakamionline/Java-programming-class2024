package com.perScholas.glabHashmapAndTreemapProcessing;

import java.util.HashMap;
//Example One: Remove HashMap Elements.

public class ExampleOneHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        // remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);
    }
}
/*Output:
HashMap: {1=Java, 2=Python, 3=JavaScript, 4=C Sharp}
Removed value: Python
Updated HashMap: {1=Java, 3=JavaScript, 4=C Sharp}
*/
