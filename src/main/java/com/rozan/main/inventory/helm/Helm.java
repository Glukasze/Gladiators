package com.rozan.main.inventory.helm;

import com.rozan.main.inventory.Item;

public abstract class Helm extends Item {

    private int armor;
    private int dodge;


    public Helm(String name, int cost, int armor, int dodge) {
        super(name, cost);
        this.armor = armor;
        this.dodge = dodge;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
