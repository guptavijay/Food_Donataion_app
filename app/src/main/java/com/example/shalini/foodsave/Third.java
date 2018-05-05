package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class Third extends AppCompatActivity {
EditText e1,e2,e3,e4;
    TextView t1,t2;
    Button b1;
    Databasehelperusername mydbuser;                        // object of class DATABASEHELPERUSERNAME
    Databasehelperpassword mydbpass;                        // object of class DATABASEHELPERPASSWORD
   // ArrayList<String> listofusers;
   // RadioButton r1,r2;
    //int otp=912345;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        e3=(EditText)findViewById(R.id.e33);
        e4=(EditText)findViewById(R.id.e44);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        b1=(Button)findViewById(R.id.b11);
        mydbuser= new Databasehelperusername(this);
        mydbpass = new Databasehelperpassword(this);
//        final ArrayList<String>  listofusers= new ArrayList<>();    arraylist to store the usernames of users

     //   r1=(RadioButton)findViewById(R.id.r11);
       // r2=(RadioButton)findViewById(R.id.r22);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                                                            // SIGN UP BUTTON>>>>>>>>>>>>
                //    Intent i3=new Intent(Third.this,MainActivity.class);
                //  startActivity(i3);
                // AlertDialog builder=new AlertDialog()
             final   String s1=e1.getText().toString();                 // username
             final String s2=e2.getText().toString();                   //password
             final   String s3=e3.getText().toString();                     //contact no
              final  String s4=e4.getText().toString();                //re enter password
          //    int count=0;
          //      String[] mStringArray = new String[listnumber.size()];
           //     mStringArray = listnumber.toArray(mStringArray);

        /*        String[] usersarray= new String[listofusers.size()];    // conversion of array list to array of string
                usersarray=listofusers.toArray(usersarray);               //further we check weather the username enters exists in the array list or not
                                                                          // if the uswername exists then user need to change the username
                for(int i=0;i<(usersarray.length);i++)
                {
                    String current= usersarray[i];
                    if(current.equals(s1))
                    {
                      count++;
                      break;
                    }

                }
                if(count>0)
                {
                    Toast.makeText(Third.this,"Username already exist!!",Toast.LENGTH_LONG).show();
                    e1.setText(" ");
                }
          */

                    if ( s1.isEmpty() || s2.isEmpty() || s3.isEmpty()  || s3.length()<10 || s4.isEmpty() || s3.length()<10)
                    {
                        Toast.makeText(Third.this,"Please Fill All The Details Correctly..!!!", LENGTH_LONG).show();
                    }

                    else {
                        if (s2.equals(s4)) {                          // INSERTING USERNAME IN DATABASE OF USERNAME
                            int count=0;
                            Cursor res3= mydbuser.getAllData();
                            while(res3.moveToNext())
                            {
                                String curname= res3.getString(1);
                                //checking all the usernames in databse if the entered one already existed or not\
                                if(s1.equals(curname))
                                {
                                    count++;
                                    break;
                                }
                            }

                          if(count > 0)
                          {
                              Toast.makeText(Third.this,"USERNAME ALREADY EXIST!!",Toast.LENGTH_LONG).show();
                          }
                          else
                          {

                              boolean isinserted = mydbuser.insertname(s1);
                              boolean isinserted2= mydbpass.inserpass(s2);

                              final AlertDialog.Builder builder = new AlertDialog.Builder(Third.this);
                              //  builder.setTitle("Sign Up Done.");
                              builder.setMessage("Registration Successful. Click OK to Log In.");
                              builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                  @Override
                                  public void onClick(DialogInterface dialog, int which) {
                                      dialog.cancel();
                                      Intent i3 = new Intent(Third.this, First.class);
                                      //           i3.putExtra("user", s1);       // passing a string into another activity--- username passing
                                      //         i3.putExtra("pw", s4);       // passing password to login activity
                                      startActivity(i3);
                                  }
                              });
                              builder.show();

                          }

                        }
                        else
                        {
                            Toast.makeText(Third.this,"Please Enter Same Passwords", LENGTH_LONG).show();
                        }
                    }


            }
        });
    }

    public void sendsms(String phoneNo, String message) {
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS SENT", LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS FAILED!", LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
