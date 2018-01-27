package com.mongogg.narra;

import io.realm.RealmObject;

/**
 * Created by leandre on 1/28/18.
 */

public class Supplier extends RealmObject {
    private String id, name;

    public Supplier(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
