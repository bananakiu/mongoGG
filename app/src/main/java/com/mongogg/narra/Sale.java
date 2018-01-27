package com.mongogg.narra;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by leandre on 1/28/18.
 */

public class Sale extends RealmObject {
    @PrimaryKey
    private String id;
    private Date date;
    private Inventory inventory;
    private Item item;

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
