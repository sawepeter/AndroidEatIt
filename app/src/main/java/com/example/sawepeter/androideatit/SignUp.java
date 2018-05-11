package com.example.sawepeter.androideatit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rengwuxian.materialedittext.MaterialEditText;

public class SignUp extends AppCompatActivity {

    MaterialEditText edtphone,edtName,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
}
