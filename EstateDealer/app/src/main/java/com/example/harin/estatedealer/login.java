package com.example.harin.estatedealer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private Button reg;
    private Button login;
    private EditText usname;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        reg=(Button) findViewById(R.id.reg);
        login=(Button) findViewById(R.id.login);
        usname=(EditText) findViewById(R.id.usname);
        pass=(EditText) findViewById(R.id.pass);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reg();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void reg()
    {
        Intent i1=new Intent(login.this,MainActivity.class);
        startActivity(i1);
    }
    private void login()
    {
        Intent i2=new Intent(login.this,ss.class);
        startActivity(i2);
    }
}
