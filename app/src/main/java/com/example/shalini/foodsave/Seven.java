package com.example.shalini.foodsave;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Seven extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
  //  List<String> l1;    //array list to store contact numbers of NGOS
    Databasehelper mDb;
    ArrayList<String> l1;                                           // LSIT OF PHONE NUMBERS OG NGOS FROM THE DATABASE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        b1 = (Button) findViewById(R.id.b11);
        b2 = (Button) findViewById(R.id.b22);
        b3 = (Button) findViewById(R.id.b33);
        b4 = (Button) findViewById(R.id.b44);
        b5 = (Button) findViewById(R.id.b55);
        b6 = (Button) findViewById(R.id.b66);
        b7 = (Button) findViewById(R.id.b77);
        b8 = (Button) findViewById(R.id.b88);
        b9 = (Button) findViewById(R.id.b99);
        l1=new ArrayList<String>();
        mDb = new Databasehelper(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
             else {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="1";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                            s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="2";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="3";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="4";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="5";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="6";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res1 = mDb.getAllData();
                if(l1.size()>0)
                {
                    l1.clear();
                }
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="7";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l1.size()>0)
                {
                    l1.clear();
                }
                Cursor res1 = mDb.getAllData();
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="8";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res1 = mDb.getAllData();
                if(l1.size()>0)
                {
                    l1.clear();
                }
                if (res1.getCount() == 0) {
                    showalert("ERROR", "NOTHING FOUND");
                    return;
                }
                else
                {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer s=new StringBuffer();
                    String s1="9";

                    while (res1.moveToNext()) {
                        s.append(res1.getString(4));

                        if (s.toString().equals(s1)== true) {
                            buffer.append("Id:" + res1.getString(0) + "\n");
                            buffer.append("NAME:" + res1.getString(1) + "\n");
                            buffer.append("ADDRESS:" + res1.getString(2) + "\n");
                            buffer.append("CONTACT:" + res1.getString(3) + "\n");
                            l1.add(res1.getString(3));
                            buffer.append("DISTRICT:" + res1.getString(4) + "\n\n");
                        }
                        s.delete(0,s.length());

                    }
                    showalert("DATA", buffer.toString());
                }
            }
        });
    }

    public void showalert(String title, String Message) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
      //  builder.setCancelable(true);
        builder.setTitle(title);
        builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent i10= new Intent(Seven.this,Fourth.class);

                i10.putExtra("arr",l1);

                startActivity(i10);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //dialogInterface.dismiss();
                dialogInterface.cancel();
            }
        });
        builder.setMessage(Message);
        builder.show();
    }
}