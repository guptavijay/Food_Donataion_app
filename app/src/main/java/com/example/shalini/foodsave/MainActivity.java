package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static android.content.DialogInterface.*;

public class MainActivity extends AppCompatActivity {
ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
i1=(ImageView)findViewById(R.id.iv11);
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
          Intent i=new Intent(MainActivity.this,Firstone.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        },3000);
    }
}
