package com.example.sawepeter.androideatit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
       // Typeface face =Typeface.createFromAsset(getAssets(),"fonts/Nabila.ttf");
        //txtSlogan.setTypeface(face);

        btnSignIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent sigin  = new Intent(this,SignIn.class);
                startActivity(sigin);

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }
}

