package com.emem.scoutcamp;

public class Main {

    public static void main(String[] args) {
        Camp camp = new Camp();
        camp.groups.add(new MaleGroup());
        camp.groups.add(new MaleGroup());
        camp.groups.add(new MaleGroup());
        camp.groups.add(new FemaleGroup());
        camp.groups.add(new FemaleGroup());
        camp.groups.add(new FemaleGroup());

        for (int i = 0; i < 10; i++) {
            camp.simulateDay();
        }
        for (Group group : camp.groups) {
            System.out.println(group.buildingsMade);
        }
    }
}
