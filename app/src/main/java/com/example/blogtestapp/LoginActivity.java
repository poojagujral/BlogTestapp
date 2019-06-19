package com.example.blogtestapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button login_btn;
    private Button reg_btn;
    private EditText login_text;
    private EditText pass_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn= (Button)findViewById(R.id.login_btn);
        reg_btn= (Button) findViewById(R.id.login_reg_btn);
        login_text= (EditText) findViewById(R.id.login_email);

    }
}
