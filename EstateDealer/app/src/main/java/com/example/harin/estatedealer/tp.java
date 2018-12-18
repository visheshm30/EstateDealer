package com.example.harin.estatedealer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class tp extends AppCompatActivity {
    private TextView t;
    private Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        t= findViewById(R.id.value);
        mref=new Firebase("https://estate-dealer.firebaseio.com/name");

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                t.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
