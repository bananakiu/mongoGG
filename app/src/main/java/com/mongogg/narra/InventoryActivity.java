package com.mongogg.narra;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import io.realm.Realm;
import io.realm.RealmResults;

public class InventoryActivity extends AppCompatActivity {

    private InventoryAdapter inventoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        Realm realm = Realm.getDefaultInstance();
        ListView inventoryListView = findViewById(R.id.inventory_listview);
        RealmResults<Inventory> results = realm.where(Inventory.class).findAll();
        inventoryAdapter = new InventoryAdapter(results, this);
        inventoryListView.setAdapter(inventoryAdapter);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
