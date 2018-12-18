package com.example.harin.estatedealer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ss extends AppCompatActivity {
    private RadioGroup r1;
    private RadioButton btn;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });

    }

    private void check()
    {
        r1=(RadioGroup)findViewById(R.id.r1);
        if(r1.getCheckedRadioButtonId()!=-1){
            RadioButton t=(RadioButton)findViewById(r1.getCheckedRadioButtonId());
            String t1=t.getText().toString();
            if(t1.equals("Seller"))
            {
                Intent i2=new Intent(ss.this, buyer1.class);
                startActivity(i2);

            }
            else
            {
                Intent i2=new Intent(ss.this, seller1.class);
                startActivity(i2);
            }
        }
    }
}
