package com.example.sawepeter.androideatit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn,btnSignup;
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button)findViewById(R.id.btnsignin);
        btnSignup = (Button)findViewById(R.id.btnsignup);

        txtSlogan = (TextView)findViewById(R.id.txtslogan);
    }
}

