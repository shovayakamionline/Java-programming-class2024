package com.perScholas.pa303Array;

import java.util.Scanner;

public class UserInputArrayTask11 {
    public static void main(String[] args) {
        System.out.println("How many favorite things do you have?");
        Scanner input = new Scanner(System.in);
        int numOfFavThing  = input.nextInt();
        String[] listOfFavThings = new String[numOfFavThing];
        for (int i = 0; i < numOfFavThing; i++) {
            System.out.print("Enter your thing: ");
            String favThing = input.next();
            listOfFavThings[i] = favThing;
        }
        System.out.println("Your favorite things are: ");
        for(String str: listOfFavThings)
          System.out.print(str +" ");
    }
}
