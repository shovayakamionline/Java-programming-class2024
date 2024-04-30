package com.perScholas.polymorphismAndInterface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //Test case #1:
        LibraryUser kidUser = new KidUser();
        kidUser.setAge(10);
        kidUser.registerAccount();
        kidUser.setAge(18);
        kidUser.registerAccount();


        kidUser.setBookType("Kids");
        kidUser.requestBook();
        kidUser.setBookType("Fiction");
        kidUser.requestBook();

//        Test case #2:
        LibraryUser adultUser = new AdultUser();
        adultUser.setAge(5);
        adultUser.registerAccount();
        adultUser.setAge(23);
        adultUser.registerAccount();

        adultUser.setBookType("Kids");
        adultUser.requestBook();
        adultUser.setBookType("Fiction");
        adultUser.requestBook();
    }
}
