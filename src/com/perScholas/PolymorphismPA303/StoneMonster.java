package com.perScholas.PolymorphismPA303;

public class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }
    public String attack() {
        return "Attack with stones!";
    }
}
