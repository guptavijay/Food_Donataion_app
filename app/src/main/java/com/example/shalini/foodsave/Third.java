package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Third extends AppCompatActivity {
EditText e1,e2,e3;
    TextView t1,t2;
    Button b1;
    ImageView i1;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        e3=(EditText)findViewById(R.id.e33);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        b1=(Button)findViewById(R.id.b11);
        i1=(ImageView)findViewById(R.id.iv11);
        r1=(RadioButton)findViewById(R.id.r11);
        r2=(RadioButton)findViewById(R.id.r22);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //    Intent i3=new Intent(Third.this,MainActivity.class);
                //  startActivity(i3);
                // AlertDialog builder=new AlertDialog()
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();

                if ( s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s3.length()<10 )
                {
                    Toast.makeText(Third.this,"Please Fill All The Details..!!!",Toast.LENGTH_LONG).show();
                }
                    else {
                    if (r1.isChecked() || r2.isChecked()) {
                        final AlertDialog.Builder builder = new AlertDialog.Builder(Third.this);
                        builder.setTitle("Sign Up Done.");
                        builder.setMessage("Your password for login is autogenrated and is same as your Phone no. Click OK to Log In.");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Intent i3 = new Intent(Third.this, First.class);
                                startActivity(i3);
                            }
                        });
                        builder.show();
                    }
                    else
                    {
                        Toast.makeText(Third.this,"Please Fill All The Details..!!!",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
