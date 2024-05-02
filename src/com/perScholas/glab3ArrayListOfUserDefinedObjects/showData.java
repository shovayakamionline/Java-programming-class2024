package com.perScholas.glab3ArrayListOfUserDefinedObjects;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        // instantioation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist)
        {
            // ---- invoking getter method for getting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }
}

/*Output:
* 1 Death note cartoon John
2 Stranger Things suspense brothers
3 Spider man Kids Alex
4 GentleMen Action Max
5 Java FullStack Programming Flex*/
