package com.rozan.main.inventory.chest;

import com.rozan.main.inventory.Item;

public abstract class Chest extends Item {

    private int armor;
    private int dodge;

    public Chest(String name, int cost, int armor, int dodge) {
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
