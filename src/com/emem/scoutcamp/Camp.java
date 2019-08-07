package com.emem.scoutcamp;

import java.util.ArrayList;
import java.util.List;

public class Camp {

    List<Group> groups = new ArrayList<>();

    public Group getLighterKids() {
        Group fastestGroup = groups.get(0);
        for (Group group : groups) {
            if (group.timeSpentWithWorkToday < fastestGroup.timeSpentWithWorkToday) {
                fastestGroup = group;
            }
        }
        return fastestGroup;
    }

    public void lightFire(Group group) {
        boolean isFireLit = false;
        while (!isFireLit) {
            if (group.haveWood) {
                if (group instanceof MaleGroup) {
                    if (Math.random() * 100 <= 70) {
                        isFireLit = true;
                    }
                } else {
                    if (Math.random() * 100 <= 75) {
                        isFireLit = true;
                    }
                }
            } else {
                group.collect();
            }
        }
        System.out.println(group.toString() + " lit the fire.");
    }

    public void simulateDay() {
        for (Group group : groups) {
            while (!group.haveWood) {
                group.collect();
            }
            while (!group.haveBuiltToday && group.rope >= 30) {
                group.build();
            }
        }
        lightFire(getLighterKids());
        for (Group group : groups) {
            group.sleep();
        }
    }
}
