package org.example.Classes;



//enums are a collection of constants that we can reference

public enum Level {

    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }
}
