package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mumbaihotel extends AppCompatActivity implements View.OnClickListener {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbaihotel);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(TextView) findViewById(R.id.t6);
        t7=(TextView) findViewById(R.id.t7);
        t8=(TextView) findViewById(R.id.t8);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        t2.setOnClickListener(this);
        t4.setOnClickListener(this);
        t6.setOnClickListener(this);
        t8.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==t2)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.hotels.com/ho623671776?_=123&PSRC=AFF01&rffrid=mdp.hcom.in.365.386.15.000.SEO.000.kwrd%3Dtop%2010%20hotels%3Aindia%3Amumbai%3A10%20best%20luxury%20hotels%20in%20mumbai"));
            startActivity(browserIntent);
        }
        else
        if (v==t4)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.hotels.com/ho212522?_=123&PSRC=AFF01&rffrid=mdp.hcom.in.365.386.15.000.SEO.000.kwrd%3Dtop%2010%20hotels%3Aindia%3Amumbai%3A10%20best%20luxury%20hotels%20in%20mumbai"));
            startActivity(browserIntent);
        }
        else
        if (v==t6)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.hotels.com/ho212522?_=123&PSRC=AFF01&rffrid=mdp.hcom.in.365.386.15.000.SEO.000.kwrd%3Dtop%2010%20hotels%3Aindia%3Amumbai%3A10%20best%20luxury%20hotels%20in%20mumbai"));
            startActivity(browserIntent);
        }
        else
        if (v==t8)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.hotels.com/ho415171?_=123&PSRC=AFF01&rffrid=mdp.hcom.in.365.386.15.000.SEO.000.kwrd%3Dtop%2010%20hotels%3Aindia%3Amumbai%3A10%20best%20luxury%20hotels%20in%20mumbai"));
            startActivity(browserIntent);
        }
        else
        if (v==button3)
        {
            startActivity(new Intent(this,mumbai.class));
        }
        else
        if (v==button4)
        {
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
