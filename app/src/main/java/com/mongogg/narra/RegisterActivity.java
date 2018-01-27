package com.mongogg.narra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Realm realm = Realm.getDefaultInstance();

        Button registerButton = findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View wiew){
                EditText editusername = findViewById(R.id.user_name);
                EditText editemail = findViewById(R.id.user_email_address);
                EditText editpassword = findViewById(R.id.user_number_password);
                final User user = new User();
                user.setId(java.util.UUID.randomUUID().toString());
                user.setName(editusername.getText().toString());
                user.setEmail(editemail.getText().toString());
                user.setPincode(editpassword.getText().toString());

                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        // This will create a new object in Realm or throw an exception if the
                        // object already exists (same primary key)
                        // realm.copyToRealm(obj);

                        // This will update an existing object with the same primary key
                        // or create a new object if an object with no primary key = 42
                        realm.copyToRealmOrUpdate(user);
                    }
                });
            }
        });

    }
}
