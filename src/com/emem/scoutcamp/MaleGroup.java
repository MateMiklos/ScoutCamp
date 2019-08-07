package com.emem.scoutcamp;

public class MaleGroup extends Group {

    @Override
    public void collect() {
        timeSpentWithWorkToday++;
        if (Math.random() * 100 <= 65) {
            haveWood = true;
        } else {
            haveWood = false;
        }
    }

    @Override
    public void build() {
        timeSpentWithWorkToday++;
        rope -= 10;
        if (Math.random() * 100 <= 75) {
            buildingsMade++;
            haveWood = false;
            rope -= 20;
            haveBuiltToday = true;
        }
    }

    @Override
    public void sleep() {
        timeSpentWithWorkToday = 0;
        haveBuiltToday = false;
    }
}
