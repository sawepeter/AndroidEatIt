package com.example.sawepeter.androideatit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    EditText edtPhone,edtPassword;
    Button btnsigin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}
