package com.emem.scoutcamp;

public abstract class Group {

    int rope = 400;
    boolean haveWood = false;
    int buildingsMade = 0;
    boolean haveBuiltToday = false;
    int timeSpentWithWorkToday = 0;

    public abstract void collect();
    public abstract void build();
    public abstract void sleep();

}
