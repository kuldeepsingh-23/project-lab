package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class delhihotel extends AppCompatActivity implements View.OnClickListener {
TextView t1,t2,t3,t4,t5,t6,t7,t8;
Button button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhihotel);
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
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/travel/hotels/Delhi/entity/CgoIj-HV2vaUh84KEAE?g2lb=4207876%2C4208993%2C4223281%2C4240601%2C4241910%2C4242081%2C4242898%2C4238563%2C4243974%2C4244079%2C4244566&hl=en&gl=in&un=0&q=delhi%204%20popular%20hotels&rp=OAJAAEgC&ictx=1&ved=0CEoQqOACKABqFwoTCLjuhJKnluECFQAAAAAdAAAAABAB&hrf=CgUI8C4QACIDSU5SKhYKBwjjDxADGBMSBwjjDxADGBQYASABsAEAmgEHEgVEZWxoaaIBEQoIL20vMDlmMDcSBURlbGhpkgECIAE&tcfs=EisKCC9tLzA5ZjA3EgVEZWxoaRoYCgoyMDE5LTAzLTE5EgoyMDE5LTAzLTIwIhgKCjIwMTktMDMtMTkSCjIwMTktMDMtMjBSAA"));
            startActivity(browserIntent);
        }
        else
            if (v==t4)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/Delhi/entity/CgoIr-i58MLFlPkiEAE?g2lb=4207876%2C4208993%2C4223281%2C4240601%2C4241910%2C4242081%2C4242898%2C4238563%2C4243974%2C4244079%2C4244566&hl=en&gl=in&un=0&q=delhi%204%20popular%20hotels&rp=OAJAAEgC&ictx=1&ved=0CFgQqOACKAFqFwoTCLjuhJKnluECFQAAAAAdAAAAABAB&hrf=CgUI8C4QACIDSU5SKhYKBwjjDxADGBMSBwjjDxADGBQYASABsAEAmgEHEgVEZWxoaaIBEQoIL20vMDlmMDcSBURlbGhpkgECIAE&tcfs=EisKCC9tLzA5ZjA3EgVEZWxoaRoYCgoyMDE5LTAzLTE5EgoyMDE5LTAzLTIwIhgKCjIwMTktMDMtMTkSCjIwMTktMDMtMjBSAA"));
            startActivity(browserIntent);
        }
        else
            if (v==t6)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/Delhi/entity/CgsIwYjsrKeanYzlARAB?g2lb=4207876%2C4208993%2C4223281%2C4240601%2C4241910%2C4242081%2C4242898%2C4238563%2C4243974%2C4244079%2C4244566&hl=en&gl=in&un=0&q=delhi%204%20popular%20hotels&rp=OAJAAEgC&ictx=1&ved=0CGYQqOACKAJqFwoTCLjuhJKnluECFQAAAAAdAAAAABAB&hrf=CgUI8C4QACIDSU5SKhYKBwjjDxADGBMSBwjjDxADGBQYASABsAEAmgEHEgVEZWxoaaIBEQoIL20vMDlmMDcSBURlbGhpkgECIAE&tcfs=EisKCC9tLzA5ZjA3EgVEZWxoaRoYCgoyMDE5LTAzLTE5EgoyMDE5LTAzLTIwIhgKCjIwMTktMDMtMTkSCjIwMTktMDMtMjBSAA"));
            startActivity(browserIntent);
        }
        else
            if (v==t8)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/Delhi/entity/CgoIlITT__HJ9ql_EAE?g2lb=4207876%2C4208993%2C4223281%2C4240601%2C4241910%2C4242081%2C4242898%2C4238563%2C4243974%2C4244079%2C4244566&hl=en&gl=in&un=0&q=delhi%204%20popular%20hotels&rp=OAJAAEgC&ictx=1&ved=0CIIBEKjgAigEahcKEwi47oSSp5bhAhUAAAAAHQAAAAAQAQ&hrf=CgUI8C4QACIDSU5SKhYKBwjjDxADGBMSBwjjDxADGBQYASABsAEAmgEHEgVEZWxoaaIBEQoIL20vMDlmMDcSBURlbGhpkgECIAE&tcfs=EisKCC9tLzA5ZjA3EgVEZWxoaRoYCgoyMDE5LTAzLTE5EgoyMDE5LTAzLTIwIhgKCjIwMTktMDMtMTkSCjIwMTktMDMtMjBSAA"));
            startActivity(browserIntent);
        }
        else
            if (v==button3)
        {
            startActivity(new Intent(this,delhi.class));
        }
        else
            if (v==button4)
        {
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
