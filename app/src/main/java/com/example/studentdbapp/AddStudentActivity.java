package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText e1, e2,e3,e4;
    AppCompatButton b1,b2;
    String getstudname,getrollnum, getadmissionnum, getcollege;
    DataBaseHelper dBhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        e1=(EditText) findViewById(R.id.studname);
        e2=(EditText) findViewById(R.id.studroll);
        e3=(EditText) findViewById(R.id.studadnum);
        e4=(EditText) findViewById(R.id.studcollege);
        dBhelper=new DataBaseHelper(this);
        dBhelper.getWritableDatabase();
        b1=(AppCompatButton) findViewById(R.id.studsubbut);
        b2=(AppCompatButton) findViewById(R.id.backlogbut);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getstudname=e1.getText().toString();
                getrollnum=e2.getText().toString();
                getadmissionnum=e3.getText().toString();
                getcollege=e4.getText().toString();
          boolean result= dBhelper.insertData(getstudname,getrollnum,getadmissionnum,getcollege);
          if (result==true)

          {
              e1.setText("");
              e2.setText("");
              e3.setText("");
              e4.setText("");
              Toast.makeText(getApplicationContext(), "successfully inserted", Toast.LENGTH_SHORT).show();
          }
          else
          {
              Toast.makeText(getApplicationContext(), "error occured", Toast.LENGTH_SHORT).show();
          }
            }
        });
    }
}