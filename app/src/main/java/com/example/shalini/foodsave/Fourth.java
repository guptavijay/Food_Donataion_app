package com.example.shalini.foodsave;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Fourth extends AppCompatActivity {
    TextView t1, t3, t4, t5;
    EditText e1, e2, e3, e4, e5;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        t1 = (TextView) findViewById(R.id.t11);

        t3 = (TextView) findViewById(R.id.t33);
        e1 = (EditText) findViewById(R.id.e11);
        e2 = (EditText) findViewById(R.id.e22);
        e3 = (EditText) findViewById(R.id.e33);
        e4 = (EditText) findViewById(R.id.e44);
        e5 = (EditText) findViewById(R.id.e55);
        t4 = (TextView) findViewById(R.id.t44);
        b1 = (Button) findViewById(R.id.b11);
        t5 = (TextView) findViewById(R.id.t55);
        final String s1 = e4.getText().toString();
        final String s2 = e5.getText().toString();
        final String s3 = e1.getText().toString();
        final String s4 = e2.getText().toString();
        final String s5 = e3.getText().toString();
        final String s6 = t4.getText().toString();
        final String s7 = t5.getText().toString();
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(Fourth.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date = String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(dayOfMonth);
                        t4.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePicker = new TimePickerDialog(Fourth.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String time = String.valueOf(hourOfDay) + ":" + String.valueOf(minute);
                        t5.setText(time);
                    }
                }, hour, minute, true);
                timePicker.show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                if ((s1.isEmpty() && s1.equals(null)) || (s2.isEmpty() && s2.equals(null)) || (s3.isEmpty() && s3.equals(null)) || (s4.isEmpty() && s4.equals(null)) || (s5.isEmpty() && s5.equals(null)) || (s6.isEmpty() && s6.equals(null)) || (s7.isEmpty() && s7.equals(null))) {
                    Toast.makeText(Fourth.this, "Please Fill All the Details!!", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });
    }
}