package com.example.practiceapplale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailTv;
    private EditText passwordTV;
    private Button loginBtn;
    private Button naBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailTv = findViewById(R.id.email_tv);
        passwordTV = findViewById(R.id.pass_tv);
        loginBtn = findViewById(R.id.login_btn);
        naBtn = findViewById(R.id.na_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailTv.getText().toString();
                String password = passwordTV.getText().toString();
                boolean status = checkCredentials(email, password);
                if(status){
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                }
            }
        });

        naBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    private boolean checkCredentials(String email, String password){
        String userEmail = "name@gmail.com";
        String userPassword = "pass123";
        if(email == userEmail && password == userPassword){
            return true;
        }else {
            return false;
        }
    }


}
