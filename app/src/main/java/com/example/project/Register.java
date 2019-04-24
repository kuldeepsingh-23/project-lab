package com.example.project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ProviderQueryResult;

import org.w3c.dom.Text;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{6,}" +               //at least 6 characters
                    "$");
    public static final Pattern NUMBER_PATTERN =
            Pattern.compile("^" +
                    ".{10,}" +
                    "$");
    //public static final boolean check = true;
    public EditText mail,pass,number,name;
    public Button button2;
    public TextView text;
    private ProgressDialog progressDialog;
    public FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),profile.class));
        }
        progressDialog=new ProgressDialog(this);
        name=(EditText)findViewById(R.id.name);
        mail=(EditText)findViewById(R.id.mail);
        pass=(EditText)findViewById(R.id.pass);
        number=(EditText)findViewById(R.id.number);
        button2=(Button) findViewById(R.id.button2);
        text=(TextView) findViewById(R.id.textView2);
        button2.setOnClickListener(this);
        text.setOnClickListener(this);
    }

    public void userlogin()
    {
        String name1=name.getText().toString().trim();
        String email=mail.getText().toString().trim();
        String password1=pass.getText().toString().trim();
        String num1=number.getText().toString().trim();
        if(TextUtils.isEmpty(name1))
        {
            Toast.makeText(this,"PLEASE ENTER THE NAME",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"PLEASE ENTER THE MAIL ",Toast.LENGTH_SHORT).show();
            return;
        }
        else
            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            {
             Toast.makeText(this,"PLEASE ENTER CORRECT EMAIL",Toast.LENGTH_SHORT).show();
            return;
            }
        if(TextUtils.isEmpty(password1))
        {
            Toast.makeText(this,"PLEASE ENTER THE PASSWORD",Toast.LENGTH_SHORT).show();
            return;
        }
        else if (!PASSWORD_PATTERN.matcher(password1).matches())
        {
           Toast.makeText(this,"PLEASE ENTER VALID PASSWORD",Toast.LENGTH_SHORT).show();
           return;
        }
        if(TextUtils.isEmpty(num1))
        {
            Toast.makeText(this,"PLEASE ENTER THE NUMBER",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(!NUMBER_PATTERN.matcher(num1).matches())
        {
            Toast.makeText(this, "ENTER VALID MOBILE NUMBER ", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("REGISTERING USER....");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email,password1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    progressDialog.dismiss();
                    Toast.makeText(Register.this,"REGISTERED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(new Intent(getApplicationContext(),profile.class));
                }
                else
                {   progressDialog.dismiss();
                    Toast.makeText(Register.this,"EMAIL ALREADY EXIST",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onClick(View v) {
        if(v==button2)
        {
            userlogin();
        }
        else if(v==text)
        {
            finish();
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
