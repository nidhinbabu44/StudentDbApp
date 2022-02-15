package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText e1, e2,e3,e4;
    AppCompatButton b1,b2;
    String getstudname,getrollnum, getadmissionnum, getcollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        e1=(EditText) findViewById(R.id.studname);
        e2=(EditText) findViewById(R.id.studroll);
        e3=(EditText) findViewById(R.id.studadnum);
        e4=(EditText) findViewById(R.id.studcollege);
        b1=(AppCompatButton) findViewById(R.id.studsubbut);
        b2=(AppCompatButton) findViewById(R.id.backlogbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getstudname=e1.getText().toString();
                getrollnum=e2.getText().toString();
                getadmissionnum=e3.getText().toString();
                getcollege=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getstudname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getrollnum, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getadmissionnum, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getcollege, Toast.LENGTH_SHORT).show();
            }
        });
    }
}