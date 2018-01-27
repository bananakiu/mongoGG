package com.mongogg.narra;

import io.realm.RealmObject;

/**
 * Created by leandre on 1/28/18.
 */

public class Item_Supplier extends RealmObject {
    private Supplier supplier;
    private Item item;
    private double price;

    public Item_Supplier(Supplier supplier, Item item, double price) {
        this.supplier = supplier;
        this.item = item;
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Item getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
