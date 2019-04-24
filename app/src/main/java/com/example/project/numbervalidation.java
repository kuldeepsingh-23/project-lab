package com.example.project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class numbervalidation extends AppCompatActivity implements View.OnClickListener {
    FirebaseAuth firebaseAuth;
    Button verify,log;
    EditText num,code;
    String codesent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbervalidation);
        firebaseAuth=FirebaseAuth.getInstance();
        verify=(Button)findViewById(R.id.button11);
        log=(Button)findViewById(R.id.button12);
        num=(EditText)findViewById(R.id.textView7);
        code=(EditText)findViewById(R.id.textView6);
        verify.setOnClickListener(this);
        log.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v==verify)
        {
         sendVerificationCode();
        }
        if(v==log)
        {
            signin();
        }
    }

    private void signin() {
        String ncode=code.getText().toString();
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(codesent,ncode );
        signInWithPhoneAuthCredential(credential);
    }
    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(numbervalidation.this,"AUTHENICATED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),profile.class));
                        }
                        else
                            {
                                if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                    Toast.makeText(numbervalidation.this,"INCORRECT CODE",Toast.LENGTH_SHORT).show();
                                }
                            }
                    }
                });
    }
    private void sendVerificationCode() {
        String phoneNumber=num.getText().toString();
        if(phoneNumber.isEmpty()){
            num.setError("PHONE NUMBER IS REQUIRED");
            num.requestFocus();
            return;
        }
        if(phoneNumber.length()<10)
        {
            num.setError("ENTER VALID PHONE NUMBER");
            num.requestFocus();
            return;
        }
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneNumber,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                mCallbacks);        // OnVerificationStateChangedCallbacks

    }
        PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {

            }

            @Override
            public void onVerificationFailed(FirebaseException e) {

            }

            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                codesent=s;
            }
        };

}
