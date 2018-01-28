package com.mongogg.narra;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

/**
 * Created by eddrichjanzzenang on 1/28/18.
 */

public class InventoryAdapter extends RealmBaseAdapter<Inventory> {

    private Activity context;
    private OrderedRealmCollection<Inventory> inventories;

    public InventoryAdapter(@Nullable OrderedRealmCollection<Inventory> inventories, Activity context) {
        super(inventories);
        this.context = context;
        this.inventories = inventories;
    }

    @Override
    public int getCount() {
        return inventories.size();
    }

    @Nullable
    @Override
    public Inventory getItem(int position) {
        return inventories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View v = context.getLayoutInflater().inflate(R.layout.inventory_row, null);
        TextView productTextView = v.findViewById(R.id.item_name_textview);
        TextView quantityTextView = v.findViewById(R.id.item_quantity_textview);
        TextView priceTextView = v.findViewById(R.id.item_price_textview);
        final Inventory inventory = inventories.get(i);
        productTextView.setText(inventory.getItem().getName());
        quantityTextView.setText(inventory.getQuantity());
        priceTextView.setText(String.valueOf(inventory.getPrice()));
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SalesDialog salesDialog = new SalesDialog(v.getContext(), inventory);
                salesDialog.show();
            }
        });

        return v;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
