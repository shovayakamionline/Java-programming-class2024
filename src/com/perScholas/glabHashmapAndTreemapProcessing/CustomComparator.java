package com.perScholas.glabHashmapAndTreemapProcessing;

import java.util.Comparator;

//Example Two: Methods for Navigation.
public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String number1, String number2) {
        int value =  number1.compareTo(number2);

        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
