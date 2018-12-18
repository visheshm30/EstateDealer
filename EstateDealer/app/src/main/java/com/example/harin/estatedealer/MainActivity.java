package com.example.harin.estatedealer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


public class MainActivity extends AppCompatActivity {





    private EditText name;
    private EditText pass;
    private Button signup;
    /*private Button Reg;
    private TextView Info;
    private int counter=5;*/

   // private StorageReference mStorageRef;
    DatabaseReference dt;
    //private DatabaseReference mDatabaseRef;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dt= FirebaseDatabase.getInstance().getReference("register");

        name= findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        signup = findViewById(R.id.signup);
       /* Reg= findViewById(R.id.Reg);
        Info = findViewById(R.id.Info);
        Info.setText("No of attempts left :5");*/

        //Reg.setOnClickListener(reg());

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });

       // mStorageRef = FirebaseStorage.getInstance().getReference( "uploads");
       // dt = FirebaseDatabase.getInstance().getReference("uploads");

    }

    private void validate()
    {
        String name1=name.getText().toString();
        String pass1=pass.getText().toString();
        if(!TextUtils.isEmpty(name1) || !TextUtils.isEmpty(pass1) ){
            String id=dt.push().getKey();
            register reg=new register(name1,pass1);
            dt.child(id).setValue(reg);
            Toast.makeText(this,"added",Toast.LENGTH_LONG).show();

            Intent i2=new Intent(MainActivity.this, login.class);


            startActivity(i2);

        }
        else{
            Toast.makeText(this,"Enter name and password",Toast.LENGTH_LONG).show();
        }
    }
}
