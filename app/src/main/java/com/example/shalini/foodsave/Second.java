package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Second extends AppCompatActivity {
ViewFlipper vf;
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
     vf=(ViewFlipper)findViewById(R.id.vf11);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
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
    }
}
