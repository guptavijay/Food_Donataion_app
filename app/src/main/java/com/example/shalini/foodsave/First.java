package com.example.shalini.foodsave;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class First extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2, b3;
    // SharedPreferences pref;
    // SharedPreferences.Editor editor;
    ImageButton b4;
    Databasehelperpassword mydbpw;                              //object of DATABSEHELPERPASSWORD CLASS
    Databasehelperusername mydbun;                              // object of DATABASEHELPERUSERNAME CLASS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_first);
        e1 = (EditText) findViewById(R.id.e11);
        e2 = (EditText) findViewById(R.id.e22);
        b1 = (Button) findViewById(R.id.b11);
        b2 = (Button) findViewById(R.id.b22);
        b3 = (Button) findViewById(R.id.b33);
        mydbpw= new Databasehelperpassword(this);
        mydbun= new Databasehelperusername(this);
        //   Bundle b=getIntent().getExtras();
        //
        // pref= getApplicationContext().getSharedPreferences("my pref",0);
        //editor=pref.edit();
       /* pref= PreferenceManager.getDefaultSharedPreferences(First.this);
        String Userid;
       Userid= pref.getString("userid",null);
        if(! Userid.equals(null))
        {
            Intent i=new Intent(First.this,Second.class);
            startActivity(i);
        } */
        final SharedPreferences sharedpref = getSharedPreferences("user info", Context.MODE_PRIVATE); // SHAREDPREFERENCES FOR LOGOUT////LOGIN
        final SharedPreferences.Editor editor = sharedpref.edit();                //user info is the name of file

        String result = sharedpref.getString("initial2", "");           // initially when user open the app then the default value stored in initial is NULL
        String res = "Vijay";
    /*    if (result.equals(res)) {

            Intent i = new Intent(First.this, Second.class);
            startActivity(i);
        } else
         */


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    editor.putString("initial2", "Vijay");       // once user logged in in intiail the value stored is equal to res(vijay)
                    editor.commit();

               /*     Bundle b = getIntent().getExtras();
                    final String username = b.getString("user");                    // user name and password from sign up activity
                    final String password = b.getString("pw");
                    StringBuffer s4=new StringBuffer();               // in which bother userpw is stored as a single term.
                    s4.append(username);
                    s4.append(password);
                    String userpw= s4.toString();              // both user and password is stored in this string as a single value and this is checked at the time of login
                    editor.putString("userpw",userpw);                                            //userpw is stored with the key value userpw)))
                    editor.putString("username",username);
                                                                       // storing the value of username in sharedpreferences in the form of key and valu
                                                                         // where key and value both are same. key--> username  value-->username  and then before login
                                                                         // we check whether the value thhat user entered is already exixted in tyhe form of key and pair in
                                                                           //sharedpreferences or not if not present then user is not able to log in .
                    editor.putString("password",password);
                                                                            // this username and passord is stored in sharedpreferences at the time of ---->>> signing up

                    // now check that the userentered username is already in sharedpreferences or not
                    // check for username and after that check that the string that contains both username and password is same as the value entered as password and username.


                    if ((!s.equals(username)) || (!s1.equals(password))) {
                        Toast.makeText(First.this, "Invalid Credentials!", Toast.LENGTH_LONG).show();
                        e1.setText("");
                        e2.setText("");
                    } else {
                        //                   pref.edit().putString("userid",s);
                        Intent i = new Intent(First.this, Second.class);
                        startActivity(i);
                    }
                */

                    String s = e2.getText().toString();        //username that have been entered
                    String s1 = e1.getText().toString();        // passowrd  that have been entered
                    StringBuffer usernameid = new StringBuffer();    // id at which the username entered is been stored in the database
                    StringBuffer passwordid = new StringBuffer();    // id at which the password entered is been stored in the database
                    // now check where the  username exists in the database  with the help of CURSOR >>>>>>>
                    Cursor res = mydbun.getAllData();
                    while (res.moveToNext()) {
                        String currusername = res.getString(1);              // Checking all the usernames one by one from datatbase
                        String curridusername = res.getString(0);             // id of current username that is checking currently
                        if (s.equals(currusername)) {
                            usernameid.append(curridusername);             // getting the id of the username that has been entered by the user during login
                            break;
                        }
                    }
                    String uid = usernameid.toString();       //converting string buffer to string (it contain the id of the username entered by the user)
                    int count = 0;

                    Cursor res2 = mydbpw.getAllData();
                    while (res2.moveToNext()) {
                        String currpasswrd = res2.getString(1);             // checking all the passwords stored in the database one by one
                        String curridpw = res2.getString(0);
                        if (curridpw.equals(uid) && currpasswrd.equals(s1)) {
                            count++;
                            break;
                        }
                    }

             /*       String pid= passwordid.toString();
                    Toast.makeText(First.this,usernameid.toString(),Toast.LENGTH_LONG).show();
                   Toast.makeText(First.this,passwordid.toString(),Toast.LENGTH_LONG).show();
*/
                    if (count > 0) {
                        Intent i = new Intent(First.this, Second.class);

                        startActivity(i);
                    } else {
                        Toast.makeText(First.this, "INVALID CREDENTIALS..!!", Toast.LENGTH_LONG).show();
                        e2.setText("");
                        e1.setText("");
                    }

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i1 = new Intent(First.this, Third.class);
                    startActivity(i1);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
      /*  final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Don't Worry");
        alertDialog.setMessage("You need to Sign up again to reset password. It will take just a few seconds.");
      alertDialog.
        alertDialog.show(); */
                    final AlertDialog.Builder builder = new AlertDialog.Builder(First.this);
                    builder.setTitle("Don't Worry");
                    builder.setMessage("You just need to sign up again, it will hardly take 10 seconds.");
                    builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            Intent i4 = new Intent(First.this, Third.class);
                            startActivity(i4);
                        }
                    });
                    builder.show();
                }
            });

        //}
    }
}