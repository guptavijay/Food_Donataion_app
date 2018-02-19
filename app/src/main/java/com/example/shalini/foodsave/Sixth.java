package com.example.shalini.foodsave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sixth extends AppCompatActivity {
TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sixth.this,Seven.class);
                startActivity(i);

            }
        });

    }
}
