package com.perScholas.glabInheritanceAndObjTypeCasting;
//Guided Lab -303.10.1 -Inheritance and Object Type Casting

public class Boy extends Person {
    static double ageFactor = 1.1;

    public String talk() {
        return (super.talk() + " ... but I love Java class.");
    }

    public String walk() {
        return ("I am now walking");
    }
}

