package com.rozan.main.inventory;

import com.rozan.main.inventory.boots.Boots;
import com.rozan.main.inventory.helm.Helm;
import com.rozan.main.inventory.chest.Chest;
import com.rozan.main.inventory.shield.Shield;
import com.rozan.main.inventory.weapon.Weapon;

public class Inventory {

    private Weapon weapon;
    private Shield shield;
    private Helm helm;
    private Chest chest;
    private Boots boots;

    private int minDamage;
    private int maxDamage;
    private int hitChance;
    private int critChance;
    private int dodge;
    private int armor;

    public Inventory(Weapon weapon, Shield shield, Helm helm, Chest chest, Boots boots) {

        setWeapon(weapon);
        setShield(shield);
        setHelm(helm);
        setChest(chest);
        setBoots(boots);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        if (this.weapon != null) {
            this.minDamage = 0;
            this.maxDamage = 0;
        }


        this.weapon = weapon;

        this.minDamage += weapon.getMinDamage();
        this.maxDamage += weapon.getMaxDamage();
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {

        if (this.shield != null) {
            this.armor -= this.shield.getArmor();
            this.dodge -= this.shield.getDodge();
        }
        this.shield = shield;

        this.armor += shield.getArmor();
        this.dodge += shield.getDodge();
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {

        if (this.helm != null) {
            this.armor -= this.helm.getArmor();
            this.dodge -= this.helm.getDodge();
        }

        this.helm = helm;

        this.armor += helm.getArmor();
        this.dodge += helm.getDodge();
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {

        if (this.chest != null) {
            this.armor -= this.chest.getArmor();
            this.dodge -= this.chest.getDodge();
        }

        this.chest = chest;

        this.armor += chest.getArmor();
        this.dodge += chest.getDodge();
    }

    public Boots getBoots() {
        return this.boots;
    }

    public void setBoots(Boots boots) {

        if (this.boots != null) {
            this.armor -= this.boots.getArmor();
            this.dodge -= this.boots.getDodge();
        }

        this.boots = boots;

        this.armor += boots.getArmor();
        this.dodge += boots.getDodge();
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

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
