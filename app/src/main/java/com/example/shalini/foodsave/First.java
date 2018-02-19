package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
    EditText e1,e2;
    Button b1,b2,b3;
   // SharedPreferences pref;
    // SharedPreferences.Editor editor;
    ImageButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        b1=(Button) findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        b3=(Button)findViewById(R.id.b33);
        b4=(ImageButton)findViewById(R.id.ib11);
       // pref= getApplicationContext().getSharedPreferences("my pref",0);
        //editor=pref.edit();
       /* pref= PreferenceManager.getDefaultSharedPreferences(First.this);
        String Userid;
       Userid= pref.getString("userid",null);
        if(! Userid.equals(null))
        {
            Intent i=new Intent(First.this,Second.class);
            startActivity(i);
        }

*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                String s=e2.getText().toString();
                String s1=e1.getText().toString();
                if( (s.length() < 10) || (! s.equals(s1)))
                {
                    Toast.makeText(First.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
                    e1.setText("");
                    e2.setText("");
                }
                else {
  //                   pref.edit().putString("userid",s);
                    Intent i=new Intent(First.this,Second.class);
                    startActivity(i);
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(First.this,Third.class);
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
      /*  final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Don't Worry");
        alertDialog.setMessage("You need to Sign up again to reset password. It will take just a few seconds.");
      alertDialog.
        alertDialog.show(); */
                final AlertDialog.Builder builder= new AlertDialog.Builder(First.this);
                builder.setTitle("Don't Worry");
                builder.setMessage("You just need to sign up again, it will hardly take 10 seconds.");
                builder.setPositiveButton("Continue" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Intent i4=new Intent(First.this,Third.class);
                        startActivity(i4);
                    }
                });
                builder.show();
            }
        });

    }
}
