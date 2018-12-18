package com.example.harin.estatedealer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class seller1 extends AppCompatActivity {
    private EditText q1;
    private EditText city;
    private EditText area;
    private EditText pin;
    private Button Add;
    DatabaseReference dt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller1);

        q1=(EditText) findViewById(R.id.q1);
        city=(EditText) findViewById(R.id.city);
        area=(EditText) findViewById(R.id.area);
        pin=(EditText) findViewById(R.id.pin);
        Add=(Button) findViewById(R.id.Add);
        dt1= FirebaseDatabase.getInstance().getReference("Land");

       Add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addLand();
           }
       });

    }
    private void addLand(){
        String state1=q1.getText().toString();
        String city1=city.getText().toString();
        String area1=area.getText().toString();
        String pin1=pin.getText().toString();

        if(!TextUtils.isEmpty(state1) || !TextUtils.isEmpty(city1) || !TextUtils.isEmpty(area1)|| !TextUtils.isEmpty(pin1)){
            String id=dt1.push().getKey();
            Land l1=new Land(state1,city1,area1,pin1);
            dt1.child(id).setValue(l1).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Toast.makeText(seller1.this, "Added", Toast.LENGTH_SHORT).show();
                }
            });
            Intent i1=new Intent(seller1.this,abc.class);
            startActivity(i1);


        }
        else{
            Toast.makeText(this,"ADDED",Toast.LENGTH_LONG).show();
        }
    }
}
