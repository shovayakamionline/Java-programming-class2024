package com.perScholas.codingchallenge.CodChallengeRandomize;

import java.util.Arrays;

/*String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};

Create a program that can randomize a list of names. Use only what has been taught thus far. Your program should return the list of string in a random order.*/

public class RandomizeList {
    public static void main(String[] args) {
        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        String[] newArray = new String[names.length];
        int randomPosition;
        for (int i = 0; i < names.length; i++) {
            do {
                randomPosition = (int) (Math.random() * names.length);
            } while (newArray[randomPosition] != null);
            newArray[randomPosition] = names[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
