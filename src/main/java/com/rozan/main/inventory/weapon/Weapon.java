package com.rozan.main.inventory.weapon;

import com.rozan.main.inventory.Item;

public abstract class Weapon extends Item {

    private int minDamage;
    private int maxDamage;
    private int hitChance;
    private int critChance;

    public Weapon(String name, int cost, int minDamage, int maxDamage, int hitChance, int critChance) {
        super(name, cost);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitChance = hitChance;
        this.critChance = critChance;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }
}
