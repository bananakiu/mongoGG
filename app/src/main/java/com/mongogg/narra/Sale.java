package com.mongogg.narra;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by leandre on 1/28/18.
 */

public class Sale extends RealmObject {
    private Date date;
    private Inventory inventory;
    private Item item;

    public Sale(Date date, Inventory inventory, Item item) {
        this.date = date;
        this.inventory = inventory;
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Item getItem() {
        return item;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
