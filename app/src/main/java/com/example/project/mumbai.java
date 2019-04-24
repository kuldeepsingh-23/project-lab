package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mumbai extends AppCompatActivity implements View.OnClickListener {

    public ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
        i1=(ImageView)findViewById(R.id.imageView5);
        i2=(ImageView)findViewById(R.id.imageView6);
        i3=(ImageView)findViewById(R.id.imageView7);
        i4=(ImageView)findViewById(R.id.imageView8);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==i1)
        {
            startActivity(new Intent(this,mumbaiinfo.class));
        }
        else if (v==i2)
        {
            startActivity(new Intent(this,mumbaimap.class));
        }
        else if (v==i3)
        {
            startActivity(new Intent(this,mumbaihotel.class));
        }
        else if(v==i4)
        {
            startActivity(new Intent(this,mumbaires.class));
        }

    }
}