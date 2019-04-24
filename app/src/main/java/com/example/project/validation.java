package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class validation extends AppCompatActivity implements View.OnClickListener {
    Button validnum,validmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        validnum=(Button)findViewById(R.id.button9);
        validmail=(Button)findViewById(R.id.button10);
        validnum.setOnClickListener(this);
        validmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==validnum)
        {
            startActivity(new Intent(this,numbervalidation.class));
        }
        else
            if(v==validmail)
        {
            startActivity(new Intent(this,mailvalidation.class));
        }
    }
}
