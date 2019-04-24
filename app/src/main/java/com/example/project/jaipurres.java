package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jaipurres extends AppCompatActivity implements View.OnClickListener {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipurres);
        t1=(TextView) findViewById(R.id.t2);
        t2=(TextView) findViewById(R.id.t4);
        t3=(TextView) findViewById(R.id.t6);
        t4=(TextView) findViewById(R.id.t8);
        button3=(Button) findViewById(R.id.button5);
        button4=(Button) findViewById(R.id.button6);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==t1)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d3337207-Reviews-Baluchi-Jaipur_Jaipur_District_Rajasthan.html"));
            startActivity(browserIntent);
        }
        else
        if (v==t2)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d1119506-Reviews-Suvarna_Mahal-Jaipur_Jaipur_District_Rajasthan.html"));
            startActivity(browserIntent);
        }
        else
        if (v==t3)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d10151338-Reviews-House_of_Han-Jaipur_Jaipur_District_Rajasthan.html"));
            startActivity(browserIntent);
        }
        else
        if (v==t4)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d3593917-Reviews-24_7_Restaurant-Jaipur_Jaipur_District_Rajasthan.html"));
            startActivity(browserIntent);
        }
        else
        if (v==button3)
        {
            startActivity(new Intent(this,jaipur.class));
        }
        else
        if (v==button4)
        {
            startActivity(new Intent(this,MainActivity.class));
        }

    }
}
