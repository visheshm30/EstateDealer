package com.example.harin.estatedealer;

import android.app.DownloadManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class buyer2 extends AppCompatActivity {

    String pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer2);

        pin=""+getIntent().getStringExtra("PIN");

        Query q1= FirebaseDatabase.getInstance().getReference(" ").orderByChild("pin").equalTo(pin);
        //q1.addListenerForSingleValueEvent(valueEventListener);
    }
}