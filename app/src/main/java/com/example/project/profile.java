
package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile extends AppCompatActivity implements View.OnClickListener {
    public FirebaseAuth firebaseAuth;
    public TextView t1,t2,t3,t4,t5,t6;
    public ImageView p1,p2,p3,p4,p5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),profile.class));
        }
        FirebaseUser user=firebaseAuth.getCurrentUser();
        setContentView(R.layout.activity_profile);
        t1=(TextView) findViewById(R.id.t1);
        t1.setText(""+user.getDisplayName());
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(TextView) findViewById(R.id.t6);
        p1=(ImageView) findViewById(R.id.p2);
        p2=(ImageView) findViewById(R.id.p3);
        p3=(ImageView) findViewById(R.id.p4);
        p4=(ImageView) findViewById(R.id.p5);
        t6.setOnClickListener(this);
        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if (v==t6)
      {
          firebaseAuth.signOut();
          finish();
          startActivity(new Intent(this,MainActivity.class));
      }
      else if(v==p1)
      {
       startActivity(new Intent(this,delhi.class));
      }
      else if(v==p2)
      {
          startActivity(new Intent(this,mumbai.class));
      }
      else if(v==p4)
      {
          startActivity(new Intent(this,jaipur.class));
      }
      else
          if(v==p3)
          {
              startActivity(new Intent(this,chennai.class));
          }
    }
}
