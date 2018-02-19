package com.example.shalini.foodsave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Firsttwo extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttwo);
        t1=(TextView)findViewById(R.id.t11);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        b1=(Button)findViewById(R.id.b11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                String s1=e2.getText().toString();
                String s2="Vijaygupta";
                if(s.equals(s1) && s.equals(s2))
                {
                    Intent i2=new Intent(Firsttwo.this,Firstthree.class);
                    startActivity(i2);
                }
                else
                {
                    Toast.makeText(Firsttwo.this,"INVALID CREDENTIALS!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
