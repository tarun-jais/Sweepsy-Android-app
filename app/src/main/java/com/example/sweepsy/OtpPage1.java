package com.example.sweepsy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

//import com.google.firebase.FirebaseException;
//import com.google.firebase.auth.PhoneAuthCredential;
//import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class OtpPage1 extends AppCompatActivity {

    EditText enternumber;
    Button getotpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page1);

        enternumber=findViewById(R.id.input_mobile_no);
        getotpbutton=findViewById(R.id.buttongetotp);


        //final ProgressBar progressBar=findViewById(R.id.progressbar_OtpPage1);




        getotpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!enternumber.getText().toString().trim().isEmpty()){
                    if(enternumber.getText().toString().trim().length()==10) {



//                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
//                                "+91" + enternumber.getText().toString(), 60, TimeUnit.SECONDS, OtpPage1.this,
//                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//                                    @Override
//                                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
//                                        progressBar.setVisibility(View.GONE);
//                                        getotpbutton.setVisibility(View.VISIBLE);
//
//                                    }
//
//                                    @Override
//                                    public void onVerificationFailed(@NonNull FirebaseException e) {
//                                        progressBar.setVisibility(View.GONE);
//                                        getotpbutton.setVisibility(View.VISIBLE);
//                                        Toast.makeText(OtpPage1.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//
//                                    }
//
//                                    @Override
//                                    public void onCodeSent(@NonNull String backendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//                                        super.onCodeSent(backendotp, forceResendingToken);
//
//                                        progressBar.setVisibility(View.GONE);
//                                        getotpbutton.setVisibility(View.VISIBLE);
                                        Intent intent = new Intent(getApplicationContext(), OtpPage2.class);
                                        intent.putExtra("mobile", enternumber.getText().toString());
                                        //intent.putExtra("backendotp",backendotp);

                                        startActivity(intent);

                                  //  }
                               // }
                       // );


                    }else {
                        Toast.makeText(OtpPage1.this, "Please enter correct number", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(OtpPage1.this, "Enter Mobile number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}