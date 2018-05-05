package com.example.shalini.foodsave;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import static android.content.DialogInterface.*;

public class MainActivity extends AppCompatActivity {
ImageView i1;
   /* TextView t1;
  //  private DrawerLayout mdrawerlayout;
    protected DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mtoolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
   */
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*    t1=(TextView)findViewById(R.id.t11);
        mdrawerlayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        mtoolbar=(Toolbar)findViewById(R.id.nav_action);
        setSupportActionBar(mtoolbar);
        mToggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);

        mdrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
   */   i1=(ImageView)findViewById(R.id.iv11);
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
