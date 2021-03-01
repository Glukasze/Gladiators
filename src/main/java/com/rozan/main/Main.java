package com.rozan.main;

import com.rozan.main.gladiators.Fighter;
import com.rozan.main.gladiators.Gladiator;
import com.rozan.main.inventory.Inventory;
import com.rozan.main.inventory.boots.ClothBoots;
import com.rozan.main.inventory.chest.ClothChest;
import com.rozan.main.inventory.helm.ClothCap;
import com.rozan.main.inventory.shield.NoShield;
import com.rozan.main.inventory.shield.WoodenShield;
import com.rozan.main.inventory.weapon.WoodenSword;

public class Main {

    public static void main (String[] args) {

        Inventory standardInventory = new Inventory(new WoodenSword(), new NoShield(), new ClothCap(), new ClothChest(), new ClothBoots());

        Gladiator gladiator1 = new Fighter("Aragorn", standardInventory);
        Gladiator gladiator2 = new Fighter("Boromir", standardInventory);

        Arena arena = new Arena(gladiator1, gladiator2);

        arena.play();
    }
}
