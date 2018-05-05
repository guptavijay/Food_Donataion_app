package com.example.shalini.foodsave;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class Second extends AppCompatActivity{
ViewFlipper vf;
    TextView t1;
    Button b1,b2;
  //  private Toolbar mtoolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
  /*    mtoolbar=(Toolbar)findViewById(R.id.nav_action);
       setSupportActionBar(mtoolbar);

        LayoutInflater inflater= (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.navigation_action,null,false);
        mdrawerlayout.addView(contentView,0);
*/
     vf=(ViewFlipper)findViewById(R.id.vf11);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        t1.setText("Over 20 crore Indians will sleep hungry tonight, of which 7 crores are children under 5 years.THINK BEFORE WASTING FOOD.!!");
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       // Intent i5=new Intent(Second.this,Fourth.class);
       // startActivity(i5);
        final AlertDialog.Builder builder=new AlertDialog.Builder(Second.this);
        builder.setTitle("Share Food with?");
        builder.setMessage("Do yo want to share food with SLUM or NGO?");
        builder.setPositiveButton("NGO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
           dialog.cancel();
                final AlertDialog.Builder alert=new AlertDialog.Builder(Second.this);
                alert.setMessage("A Text messege is send to NGOS which contains your Contact number and food details");
                alert.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Intent i=new Intent(Second.this,Sixth.class);
                        startActivity(i);
                    }
                });
                alert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
                    }
                });
                alert.show();
            }
        });
        builder.setNegativeButton("SLUM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                final AlertDialog.Builder abc=new AlertDialog.Builder(Second.this);
                abc.setTitle("Slums");
                abc.setMessage("You can also distribute food to the nearby SLUM Areas.There are plenty of slum Areas in India.We are not able to provide you the Data of slums around you beacuse there is no exact defination of slums.You can Distribute food to the Slums. THAT IS A GREAT ININTIATIVE..!!");
                abc.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
               /* abc.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });*/
                abc.show();
            }
        });
builder.show();

    }
});

  b2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          SharedPreferences pref= getSharedPreferences("user info", Context.MODE_PRIVATE);   //  user info is the name of file in which login s=details are stored
          SharedPreferences.Editor editor= pref.edit();
          editor.clear();
          editor.commit();
          finish();

          //  String a=  pref.getString("initial1"," ");
          //Toast.makeText(Ninth.this,a,Toast.LENGTH_LONG).show();
          Intent i3=new Intent(Second.this,First.class);
          startActivity(i3);
      }
  });
    }
}
