package com.perScholas.codingchallenge.combinations;
/*Create a program that will output the total number of combinations for a password with a length
of 4 using only the numbers  1-4. You can repeat numbers but not the combination.
Do not show duplicate combinations.

Ex:  1111 is okay */

public class CoddingChallengeCombination {
    public static void main(String[] args) {

        printCombinationsForPassword(4);
        printCombinationsForPassword(4);

    }

    private static void printCombinationsForPassword(int count) {
        int combinationCount = 0;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <=count; j++) {
                for (int k = 1; k <=count; k++) {
                    for (int l = 1; l <=count; l++) {
                        System.out.println(i + "" + j + k + l);
                        combinationCount++;
                    }
                }
            }
        }
        System.out.println("The total number of combinations for a password: "+ combinationCount);
    }
}
