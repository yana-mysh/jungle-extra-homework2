package de.mysh.junglesimulator.entity;

public class Elephant {

    private int health = 100;
    private int energy = 100;
    private final int teeth = 5;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getTeeth() {
        return this.teeth;
    }

}
