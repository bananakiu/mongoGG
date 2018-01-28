package com.mongogg.narra;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.UUID;

import io.realm.Realm;

/**
 * Created by eddrichjanzzenang on 1/28/18.
 */

public class NewInventoryDialog extends Dialog {
    public NewInventoryDialog(Context c) {
        super(c);
        setTitle("Add item");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_new_inventory);
        Button newItem = findViewById(R.id.add_item_button);
        newItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm = Realm.getDefaultInstance();
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        EditText name = findViewById(R.id.new_product_name_edittext);
                        EditText qty = findViewById(R.id.new_product_quantity_edittext);
                        EditText price = findViewById(R.id.new_product_price_edittext);
                        Inventory inventory = realm.createObject(Inventory.class);
                        inventory.setId(UUID.randomUUID().toString());
                        inventory.setItem(realm.where(Item.class).equalTo("name", name.getText().toString()).findFirst());
                        inventory.setQuantity(Integer.parseInt(qty.getText().toString()));
                        inventory.setPrice(Double.parseDouble(price.getText().toString()));
                    }
                });
                dismiss();
            }
        });
    }
}
