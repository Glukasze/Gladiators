package com.rozan.main.gladiators;

import com.rozan.main.inventory.Inventory;

import java.util.Random;

public abstract class Gladiator {

    private String name;

    private int hp;
    private int currentHp;
    private int strength;
    private int agility;

    private int armor = 0;
    private int dodge = 50;
    private int hitChance = 0;
    private int critChance = 0;
    private int minWeaponDamage = 1;
    private int maxWeaponDamage = 2;
    private int damageModifier = 0;

    private Inventory inventory;

    public Gladiator(String name, int hp, int strength, int agility, Inventory inventory) {

        this.name = name;
        this.hp = hp;
        this.currentHp = hp;
        this.strength = strength;
        this.agility = agility;
        this.inventory = inventory;
        this.armor += inventory.getArmor();
        this.dodge +=  (agility / 2) + inventory.getDodge();
        this.hitChance += (agility / 2) + inventory.getHitChance();
        this.critChance += (agility / 2) + (strength / 2) + inventory.getCritChance();
        this.minWeaponDamage = inventory.getMinDamage();
        this.maxWeaponDamage = inventory.getMaxDamage();
        this.damageModifier = this.strength / 2;
    }

    public void attack(Gladiator gladiator) {
        Random random = new Random();
        int damage = random.nextInt(maxWeaponDamage - minWeaponDamage) + minWeaponDamage + damageModifier;
        int hit = random.nextInt(100);
        if (hit >= 100 - this.critChance) {
            damage *= 2;
        }

        if (hit > gladiator.getDodge() - this.hitChance) {
            if (damage <= gladiator.getArmor()) {
                gladiator.setCurrentHp(gladiator.getCurrentHp() - 1);
                System.out.println(this.name + " hit " + gladiator.getName() + " for " + damage + " damage. Not very effective\n");
            } else {
                gladiator.setCurrentHp(gladiator.getCurrentHp() - (damage - gladiator.getArmor()));
                System.out.println(this.name + " hit " + gladiator.getName() + " for " +
                        (damage - gladiator.getArmor()) +  " damage (" + gladiator.getArmor() +  " stopped by armor)\n");
            }
        } else {
            System.out.println(this.name + " missed " + gladiator.getName() + "\n");
        }

    }

    public boolean isDead() {
        return getCurrentHp() <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
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

    public int getMinWeaponDamage() {
        return minWeaponDamage;
    }

    public void setMinWeaponDamage(int minWeaponDamage) {
        this.minWeaponDamage = minWeaponDamage;
    }

    public int getMaxWeaponDamage() {
        return maxWeaponDamage;
    }

    public void setMaxWeaponDamage(int maxWeaponDamage) {
        this.maxWeaponDamage = maxWeaponDamage;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
