package com.example.project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText email;
    public EditText pass;
    public Button button;
    public TextView reg;
    public FirebaseAuth firebaseAuth;
    public ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),profile.class));
        }
        email=(EditText) findViewById(R.id.email);
        pass=(EditText) findViewById(R.id.pass);
        button=(Button) findViewById(R.id.button);
        reg=(TextView) findViewById(R.id.reg);
        button.setOnClickListener(this);
        reg.setOnClickListener(this);
    }
    public void login()
    {
        String mail=email.getText().toString().trim();
        String ps=pass.getText().toString().trim();
        if(TextUtils.isEmpty(mail))
        {
            Toast.makeText(this,"PLEASE ENTER THE MAIL ",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(ps))
        {
            Toast.makeText(this,"PLEASE ENTER THE PASSWORD",Toast.LENGTH_SHORT).show();
            return;
        }
        firebaseAuth.signInWithEmailAndPassword(mail,ps).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
             if (task.isSuccessful())
             {   finish();
                 startActivity(new Intent(getApplicationContext(),profile.class));
             }
             else
             {
                 Toast.makeText(MainActivity.this,"ENTER VALID EMAIL AND PASSWORD",Toast.LENGTH_SHORT).show();
             }
            }
        });
    }
    @Override
    public void onClick(View v) {
          if (v==reg)
          {
              finish();
              startActivity(new Intent(this,Register.class));
          }
          else if(v==button)
          {
              login();
          }
    }
}
