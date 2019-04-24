package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jaipurhotel extends AppCompatActivity implements View.OnClickListener {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipurhotel);
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
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/in/jw-marriott-jaipur-resort-spa.html?aid=356980;label=gog235jc-1DCAMYyAEobEIGamFpcHVySDNYA2hsiAEBmAExuAEXyAEM2AED6AEB-AECiAIBqAIDuALDgufkBcACAQ;sid=4be8a0aff359227c35fe985dbcce6bba;dest_id=-2098033;dest_type=city;dist=0;hapos=1;hpos=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1553581460;srpvid=a1472d0a98540342;type=total;ucfs=1&#hotelTmpl"));
            startActivity(browserIntent);
        }
        else
        if (v==t4)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/in/sujan-rajmahal-palace.html?aid=356980&label=gog235jc-1DCAMYyAEobEIGamFpcHVySDNYA2hsiAEBmAExuAEXyAEM2AED6AEB-AECiAIBqAIDuALDgufkBcACAQ&sid=4be8a0aff359227c35fe985dbcce6bba&dest_id=-2098033&dest_type=city&hapos=1&hpos=1&sr_order=popularity&srepoch=1553581500&srpvid=74ff2d1d4c36014b&ucfs=1&from=searchresults;highlight_room=#hotelTmpl"));
            startActivity(browserIntent);
        }
        else
        if (v==t6)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/in/rambagh-palace.html?aid=356980&label=gog235jc-1DCAMYyAEobEIGamFpcHVySDNYA2hsiAEBmAExuAEXyAEM2AED6AEB-AECiAIBqAIDuALDgufkBcACAQ&sid=4be8a0aff359227c35fe985dbcce6bba&dest_id=-2098033&dest_type=city&hapos=1&hpos=1&sr_order=popularity&srepoch=1553581524&srpvid=0f7c2d2a3a2d0228&ucfs=1&from=searchresults;highlight_room=#hotelTmpl"));
            startActivity(browserIntent);
        }
        else
        if (v==t8)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.booking.com/hotel/in/hilton-jaipur.html?aid=356980;label=gog235jc-1DCAMYyAEobEIGamFpcHVySDNYA2hsiAEBmAExuAEXyAEM2AED6AEB-AECiAIBqAIDuALDgufkBcACAQ;sid=4be8a0aff359227c35fe985dbcce6bba"));
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
