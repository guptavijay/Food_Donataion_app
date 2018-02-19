package com.example.shalini.foodsave;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Shalini on 08-02-2018.
 */

public class Databasehelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="NGO.db";
    public static final String TABLE_NAME="NGO_TABLE";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="ADDRESS";
    public static final String COL_4="CONTACT";
    public static final String COL_5="DISTRICT";



    public Databasehelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,ADDRESS TEXT,CONTACT INTEGER, DISTRICT INTEGER ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String address, String number, String district )
    {
        SQLiteDatabase db= this.getWritableDatabase();

        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,address);
        contentValues.put(COL_4,number);
        contentValues.put(COL_5,district);

        long result= db.insert(TABLE_NAME,null,contentValues);
        if(result== -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }

    public boolean updatedata(String id, String name, String address, String contact, String district)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,address);
        contentValues.put(COL_4,contact);
        contentValues.put(COL_5,district);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }
}
