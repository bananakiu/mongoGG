package com.mongogg.narra;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by leandre on 1/28/18.
 */

public class User extends RealmObject {
    @PrimaryKey
    private String id;
    private String name, email;
    private String pincode;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPincode() {
        return pincode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
