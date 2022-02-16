package com.example.studentdbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper
{
    static String DBName="College.db";
    static String TableName="students";
    static String col1="ID";
    static String col2="Name";
    static String col3="RollNumber";
    static String col4="AdmissionNumber";
    static String col5="College";

    public DataBaseHelper(@Nullable Context context)

    {
        super(context, DBName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

String query=" create table " +
        TableName+ "("+col1+" integer primary key autoincrement,"+
        col2+" text,"+
        col3+" text,"+
        col4+" text,"+
        col5+" text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  boolean insertData(String name,String rollno,String adno,String college) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put(col2, name);
        c.put(col3, rollno);
        c.put(col4, adno);
        c.put(col5, college);

        long status=db.insert(TableName,null,c );
        if (status==-1)
        {
            return false;
        }
        else
            {
            return true;
        }
    }


}
