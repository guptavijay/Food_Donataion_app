package com.example.shalini.foodsave;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Firstthree extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;
    EditText e1,e2,e3,e4,e5;
    Button b1,b2,b3,b4;
    Databasehelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstthree);
        myDb= new Databasehelper(this);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t4=(TextView)findViewById(R.id.t44);
        t5=(TextView)findViewById(R.id.t55);
        t6=(TextView)findViewById(R.id.t66);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        e3=(EditText)findViewById(R.id.e33);
        e4=(EditText)findViewById(R.id.e44);
        e5=(EditText)findViewById(R.id.e55);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
       b3=(Button)findViewById(R.id.b33);
        b4=(Button)findViewById(R.id.b44);
        adddata();
        viewall();
        delete();
        update();
    }
  public void update()
  {
      b4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String a= e1.getText().toString();
              String b= e2.getText().toString();
              String c= e3.getText().toString();
              String d= e4.getText().toString();
              String e= e5.getText().toString();
              if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty())
              {
                  Toast.makeText(Firstthree.this,"ENETR ALL DETAILS!!!", Toast.LENGTH_LONG).show();
              }
              else {

                  boolean isupdate = myDb.updatedata(e4.getText().toString(), e1.getText().toString(), e2.getText().toString(),
                          e3.getText().toString(), e5.getText().toString());

                  if(isupdate==true)
                  {
                      Toast.makeText(Firstthree.this,"DATA UPDATED!!",Toast.LENGTH_LONG).show();
                      e1.setText("");
                      e2.setText("");
                      e3.setText("");
                      e4.setText("");
                      e5.setText("");
                  }
                  else
                  {
                      Toast.makeText(Firstthree.this,"DATA NOT UPADTED!!",Toast.LENGTH_LONG).show();
                  }
              }
          }
      });
  }

    public void adddata()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(Firstthree.this,"YES",Toast.LENGTH_LONG).show();
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s5=e5.getText().toString();
                if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s5.isEmpty())
                {
                    Toast.makeText(Firstthree.this,"Fill all details..!!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    boolean isinserted= myDb.insertData(s1,s2,s3,s5);
                    if(isinserted==true)
                    {
                        Toast.makeText(Firstthree.this,"Data inserted!!",Toast.LENGTH_LONG).show();
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e5.setText("");
                    }
                    else
                    {
                        Toast.makeText(Firstthree.this,"DATA NOT INSERTED",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
    public void viewall()
    {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                if(res.getCount() == 0) {
                    // show message
                    showMessage("Error","Nothing found");
                    return;
                }
                StringBuffer stringBuffer=new StringBuffer();
                while(res.moveToNext())
                {
                    stringBuffer.append("Id:"+ res.getString(0)+ "\n");
                    stringBuffer.append("NAME:"+ res.getString(1)+ "\n");
                    stringBuffer.append("ADDRESS:"+ res.getString(2)+ "\n");
                    stringBuffer.append("CONTACT:"+ res.getString(3)+ "\n");
                    stringBuffer.append("DISTRICT:" + res.getString(4)+ "\n\n");
                }
                showMessage("DATA",stringBuffer.toString());
            }
        });
    }

    public void delete()
    {
     b3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

              String ide= e4.getText().toString();
             if(ide.isEmpty())
             {
                 Toast.makeText(Firstthree.this,"ENTER THE ID!!",Toast.LENGTH_LONG).show();
             }
             else {
                 Integer deleterows = myDb.deleteData(e4.getText().toString());
                 if (deleterows > 0) {
                     Toast.makeText(Firstthree.this, "Data Deleted!!", Toast.LENGTH_LONG).show();
                     e4.setText(" ");
                 } else {
                     Toast.makeText(Firstthree.this, "Data Not Deleted!!", Toast.LENGTH_LONG).show();
                 }
             }
         }
     });
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
