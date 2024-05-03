package com.perScholas.glabInheritanceAndObjTypeCasting;

public class TestPeople {

    public static void main(String args[]) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        // Boy b = new Person();  // Throw Error
        // Girl g = new Person()  // Throw Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println((Person) jimmy);
        System.out.println(((Person) jimmy).talk());
        System.out.println(((Person) jimmy).walk());
        System.out.println();

        System.out.println((Person) betty);
        System.out.println(((Person) betty).talk());
        System.out.println(((Person) betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println(((Boy) aPerson).talk());
    }
}

/*Hello, my name is Fred.
I have nothing to say.
I have nowhere to go.

Hello, my name is
I have nothing to say... but I love Java class.
I am now walking.

Hello, my name is Ms.Betty.
Hello! I am jumping.
I have nowhere to go.

Hello, my name is
I have nothing to say... but I love Java class.
I am now walking.

Hello, my name is Ms.Betty
Hello! I am jumping.
I have nowhere to go.

60.0
60.0
78.0

Exception in thread "main" java.lang.ClassCastException: objectTypeCasting.Person cannot be cast to objectTypeCasting.Boy
	at objectTypeCasting.TestPeople.main(TestPeople.java:44)
*/