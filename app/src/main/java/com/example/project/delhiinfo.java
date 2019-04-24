package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class delhiinfo extends AppCompatActivity implements View.OnClickListener {
   ImageView i1,i2,i3,i4,i5,i6;
   Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhiinfo);
        i1=(ImageView) findViewById(R.id.imageView3);
        i2=(ImageView) findViewById(R.id.imageView4);
        i3=(ImageView) findViewById(R.id.imageView9);
        i4=(ImageView) findViewById(R.id.imageView10);
        i5=(ImageView) findViewById(R.id.imageView11);
        i6=(ImageView) findViewById(R.id.imageView12);
        button1=(Button)findViewById(R.id.button8);
        button2=(Button)findViewById(R.id.button7);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==i1)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://rashtrapatisachivalaya.gov.in/rbtour/"));
            startActivity(browserIntent);
        }
        else
            if (v==i2)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://asi.nic.in/asi_monu_tktd_delhi_redfort.asp"));
            startActivity(browserIntent);
        }
        else
            if (v==i3)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.delhitourism.gov.in/delhitourism/tourist_place/qutab_minar.jsp"));
            startActivity(browserIntent);
        }
        else
            if (v==i4)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.delhitourism.gov.in/delhitourism/tourist_place/jantar_mantar.jsp/"));
            startActivity(browserIntent);
        }
        else
            if (v==i5)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.delhitourism.gov.in/delhitourism/tourist_place/india_gate.jsp"));
            startActivity(browserIntent);
        }
        else
            if (v==i6)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Jama_Masjid,_Delhi"));
            startActivity(browserIntent);
        }
        else if (v==button1)
            {
                startActivity(new Intent(this,delhi.class));
            }
            else
                if (v==button2)
                {
                    startActivity(new Intent(this,MainActivity.class));
                }

    }
}
