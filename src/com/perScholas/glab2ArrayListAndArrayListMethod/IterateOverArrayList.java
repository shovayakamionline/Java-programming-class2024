package com.perScholas.glab2ArrayListAndArrayListMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Example 5: Iterating over an ArrayList

public class IterateOverArrayList {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });


        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        System.out.println("\n=== Iterate iterator ===");
        ListIterator iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");

        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}

/*Output:
* === Iterate using an iterator() ===
Breaking Bad
Game Of Thrones
Friends
Prison break
==Iterate using an iterator() and forEachRemaining() method ===
Breaking Bad
Game Of Thrones
Friends
Prison break

=== Iterate using simple for-each loop ===
Breaking Bad
Game Of Thrones
Friends
Prison break

=== Iterate using for loop with index ===
Breaking Bad
Game Of Thrones
Friends
Prison break

=== Iterate iterator ===
Elements in forward direction

====== Iterate using while loop=======
Breaking Bad
Game Of Thrones
Friends
Prison break
=========Elements in backward direction======
Prison break
Friends
Game Of Thrones
Breaking Bad*/