package com.perScholas.glabHashmapAndTreemapProcessing;

import java.util.TreeMap;

public class MainComparator {

    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }

}

/*Output
TreeMap: {Third=3, Second=2, Fourth=4, First=1}
*/
