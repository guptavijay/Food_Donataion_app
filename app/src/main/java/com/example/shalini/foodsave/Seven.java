package com.example.shalini.foodsave;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Seven extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Databasehelper mDb;

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
        mDb = new Databasehelper(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}