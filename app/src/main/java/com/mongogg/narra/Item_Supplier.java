package com.mongogg.narra;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by leandre on 1/28/18.
 */

public class Item_Supplier extends RealmObject {
    @PrimaryKey
    private String id;
    private Supplier supplier;
    private Item item;
    private double price;

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
