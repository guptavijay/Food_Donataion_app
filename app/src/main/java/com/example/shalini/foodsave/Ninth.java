package com.example.shalini.foodsave;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Ninth extends AppCompatActivity {
   TextView t1,t2;
   ImageView iv1;
   Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // you have successfully submitted a donation
        setContentView(R.layout.activity_ninth);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);      //email = vg7579@gmail.com
      //                                             name = guptavijay
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
     //   b3=(Button)findViewById(R.id.b33);
        iv1=(ImageView)findViewById(R.id.iv11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ninth.this,Second.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Ninth.this,Second.class);
                startActivity(i2);
            }
        });
    /*    b3.setOnClickListener(new View.OnClickListener() {             A complete food donation app through which you can
donate excess food to the NGOS in your district.
This app is currently working in DELHI city and cover all
the districts of DELHI. NGOS will themselves
pick up the food once they get to know about the excess food.
            @Override
            public void onClick(View view) {

                SharedPreferences pref= getSharedPreferences("user info", Context.MODE_PRIVATE);   //  user info is the name of file in which login s=details are stored
                SharedPreferences.Editor editor= pref.edit();
                editor.clear();
                editor.commit();                                                                    // 7988270846  7838713737  8377070629
                finish();

              //  String a=  pref.getString("initial1"," ");
                //Toast.makeText(Ninth.this,a,Toast.LENGTH_LONG).show();
               Intent i3=new Intent(Ninth.this,First.class);
               startActivity(i3);
            }
        });*/
    }
}
