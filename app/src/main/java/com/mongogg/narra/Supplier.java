package com.mongogg.narra;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by leandre on 1/28/18.
 */

public class Supplier extends RealmObject {
    @PrimaryKey
    private String id;
    private String name;

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
