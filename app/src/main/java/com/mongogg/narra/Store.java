package com.mongogg.narra;

import io.realm.RealmObject;

/**
 * Created by leandre on 1/28/18.
 */

public class Store extends RealmObject {
    private String id, name;
    private String location;
    private User user;

    public Store(String id, String name, String location, User user) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public User getUser() {
        return user;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
