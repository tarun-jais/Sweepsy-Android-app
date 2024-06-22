package com.example.sweepsy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.FirebaseException;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.PhoneAuthCredential;
//import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class OtpPage2 extends AppCompatActivity {

    EditText inputno1,inputno2,inputno3,inputno4,inputno5,inputno6;
   // String getotpbackend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page2);

        final Button submitButton=findViewById(R.id.submitB);

        inputno1=findViewById(R.id.otp1);
        inputno2=findViewById(R.id.otp2);
        inputno3=findViewById(R.id.otp3);
        inputno4=findViewById(R.id.otp4);
        inputno5=findViewById(R.id.otp5);
        inputno6=findViewById(R.id.otp6);

        TextView textview=findViewById(R.id.textView7);
        textview.setText(String.format(
                "+91-%s",getIntent().getStringExtra("mobile")
        ));


        //getotpbackend=getIntent().getStringExtra("backendotp");
        //final ProgressBar progressbarotppage2=findViewById(R.id.progressbar_OtpPage2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!inputno1.getText().toString().trim().isEmpty() && !inputno2.getText().toString().trim().isEmpty() && !inputno3.getText().toString().trim().isEmpty() && !inputno4.getText().toString().trim().isEmpty() && !inputno5.getText().toString().trim().isEmpty() && !inputno6.getText().toString().trim().isEmpty()){

//                    String entercodeotp=inputno1.getText().toString()+
//                            inputno2.getText().toString()+
//                            inputno3.getText().toString()+
//                            inputno4.getText().toString()+
//                            inputno5.getText().toString()+
//                            inputno6.getText().toString();
//                    if(getotpbackend!=null){
//                        progressbarotppage2.setVisibility(View.VISIBLE);
//                        submitButton.setVisibility(View.INVISIBLE);
//
//                        PhoneAuthCredential phoneAuthCredential= PhoneAuthProvider.getCredential(
//                                getotpbackend, entercodeotp
//                        );
//                        FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
//                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                                    @Override
//                                    public void onComplete(@NonNull Task<AuthResult> task) {
//                                        progressbarotppage2.setVisibility(View.GONE);
//                                        submitButton.setVisibility(View.VISIBLE);
//
//                                        if(task.isSuccessful()){
//                                            Intent intent= new Intent(getApplicationContext(),Sign_Up.class);
//                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                            startActivity(intent);
//                                        }else{
                                            Toast.makeText(OtpPage2.this, "Enter the correct otp", Toast.LENGTH_SHORT).show();
                                       // }
                                    //}
                                //});

//                    }else {
//                        Toast.makeText(OtpPage2.this, "Please check internet connection", Toast.LENGTH_SHORT).show();
//                    }


                 //   Toast.makeText(OtpPage2.this, "otp verify", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(OtpPage2.this, "Please enter all number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        numberotpmove();

//        findViewById(R.id.textView9).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PhoneAuthProvider.getInstance().verifyPhoneNumber(
//                        "+91" + getIntent().getStringExtra("mobile"), 60, TimeUnit.SECONDS, OtpPage2.this,
//                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//                            @Override
//                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
//
//
//                            }
//
//                            @Override
//                            public void onVerificationFailed(@NonNull FirebaseException e) {
//
//                                Toast.makeText(OtpPage2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//
//                            }
//
//                            @Override
//                            public void onCodeSent(@NonNull String newbackendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//                                super.onCodeSent(newbackendotp, forceResendingToken);
//
//                               getotpbackend=newbackendotp;
//                                Toast.makeText(OtpPage2.this, "OTP sended Successfully", Toast.LENGTH_SHORT).show();
//
//
//                            }
//                        }
//                );
//
//            }
//        });
    }





    private void numberotpmove() {
        inputno1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputno2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputno2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputno3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputno3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputno4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputno4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputno5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputno5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputno6.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}