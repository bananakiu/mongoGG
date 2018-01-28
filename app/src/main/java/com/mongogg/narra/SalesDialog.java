package com.mongogg.narra;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by eddrichjanzzenang on 1/28/18.
 */

public class SalesDialog extends Dialog {
    private Inventory inventory;
    public SalesDialog(@NonNull Context context, Inventory inventory) {
        super(context);
        this.inventory = inventory;
        setTitle("Sell Item");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_sell_inventory);
        final Button sellItem = findViewById(R.id.sell_item_button);
        sellItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inventory.setPrice(inventory.getPrice()-Integer.parseInt(sellItem.getText().toString()));
                dismiss();
            }

        });

    }
}
