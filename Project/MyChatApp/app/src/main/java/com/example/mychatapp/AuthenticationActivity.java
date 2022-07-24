package com.example.mychatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AuthenticationActivity extends MyBaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signInHandler(View v) {
        EditText userText = findViewById(R.id.Login_UserName);
        EditText passText = findViewById(R.id.Login_Password);

        String username = userText.getText().toString();
        String password = passText.getText().toString();

    }




}