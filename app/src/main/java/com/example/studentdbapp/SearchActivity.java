package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
EditText e1;
AppCompatButton b1, b2;
String getAdmission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        e1=(EditText) findViewById(R.id.admi);
        b1=(AppCompatButton) findViewById(R.id.sebut);
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
                getAdmission=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getAdmission, Toast.LENGTH_SHORT).show();
            }
        });
    }
}