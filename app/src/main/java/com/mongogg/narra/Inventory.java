package com.mongogg.narra;

import io.realm.RealmObject;

/**
 * Created by leandre on 1/28/18.
 */

public class Inventory extends RealmObject {
    private String id;
    private int quantity;
    private double price;
    private Store store;
    private Item item;

    public Inventory(String id, int quantity, double price, Store store, Item item) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.store = store;
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Store getStore() {
        return store;
    }

    public Item getItem() {
        return item;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
