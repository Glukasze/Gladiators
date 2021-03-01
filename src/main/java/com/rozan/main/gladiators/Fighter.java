package com.rozan.main.gladiators;

import com.rozan.main.inventory.Inventory;

public class Fighter extends Gladiator {
    public Fighter(String name, Inventory inventory) {
        super(name, 20, 15, 15, inventory);
    }
}
