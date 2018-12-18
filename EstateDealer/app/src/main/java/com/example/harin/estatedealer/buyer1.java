package com.example.harin.estatedealer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class buyer1 extends AppCompatActivity {

    private EditText pin;
    private Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer1);

        pin = (EditText) findViewById(R.id.pin);
        search = (Button) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pin1=pin.getText().toString();
                Intent i1=new Intent(buyer1.this,buyer2.class);
                getIntent().putExtra("PIN",pin1);
                startActivity(i1);

            }
        });


    }
}
