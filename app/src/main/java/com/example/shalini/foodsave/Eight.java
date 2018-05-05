package com.example.shalini.foodsave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Eight extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t4=(TextView)findViewById(R.id.t44);
        t5=(TextView)findViewById(R.id.t55);
        t6=(TextView)findViewById(R.id.t66);
        t7=(TextView)findViewById(R.id.t77);
        t8=(TextView)findViewById(R.id.t88);
        t9=(TextView)findViewById(R.id.t99);
        t10=(TextView)findViewById(R.id.t110);
        t11=(TextView)findViewById(R.id.t111);
        t12=(TextView)findViewById(R.id.t112);
        t13=(TextView)findViewById(R.id.t113);
        t14=(TextView)findViewById(R.id.t114);
        t15=(TextView)findViewById(R.id.t115);
      //  t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
        Bundle b= getIntent().getExtras();

        final String a= b.getString("one");
        final String bb= b.getString("two");
        final String c=b.getString("three");
        final String d=b.getString("four");
        final String e=b.getString("five");
        final String f=b.getString("six");
        final String g=b.getString("seven");
        t9.setText(a);
        t10.setText(bb);
        t11.setText(c);
        t12.setText(d);
        t13.setText(e);                        //
        t14.setText(f);
        t15.setText(g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> listnumber= (ArrayList<String>)getIntent().getSerializableExtra("finallist"); // list of contacts of NGOS from previous activy using intent
                String[] mStringArray = new String[listnumber.size()];                           // converting array list into string array in which contact numbers are stored in the for m of strings
                mStringArray = listnumber.toArray(mStringArray);
            StringBuffer s=new StringBuffer();                             // creating the customize sms that contains details of food!!!!!
            s.append("Donor Name: " + a +"\n");
            s.append("Address:  "+  bb + "\n");
            s.append("Contact: " + c + "\n");
            s.append("Food Details:" + e + "(qty) " + "  " + d + "\n");
            s.append("Cooked Date & Time:" + f + " " + g + "\n");
           // s.append("Contact donor for pick up of food within 15 minutes if you are interested.!!" );
            for(int i=0;i<(mStringArray.length);i++)
            {
              String phoneNo=  mStringArray[i] ;   // sending text message one by one to all the contact numbers in list
                Toast.makeText(Eight.this,phoneNo,Toast.LENGTH_LONG).show();
                String message= s.toString();
                if(phoneNo.length()>0 && s.length()>0)
                {
                    Toast.makeText(Eight.this,message,Toast.LENGTH_LONG).show();
                    sendsms(phoneNo,message);
                }
            }
                Intent i3= new Intent(Eight.this,Ninth.class);
                startActivity(i3);

            }
        });
    }

    public void sendsms(String phoneNo, String message) {
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS SENT", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS FAILED!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
