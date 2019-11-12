package com.company;

public class Boss {
    private int health;
    private int attack;
    private int defenceType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public Boss(int health, int attack, int defenceType) {
        this.attack = attack;
        this.health = health;
        this.defenceType = defenceType;
    }

    public Boss() {
    }

}
