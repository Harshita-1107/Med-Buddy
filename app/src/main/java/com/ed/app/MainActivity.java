package com.ed.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button Google;
Button Sign_in;
Button Create_account;
TextView Sign;
TextView or;
TextView forget_password;
ImageView logo;
EditText email;
EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Google = (Button)findViewById(R.id.button);
        Sign_in = (Button)findViewById(R.id.button2);
        Create_account = (Button)findViewById(R.id.button3);
        Sign = (TextView)findViewById(R.id.textView);
        or = (TextView)findViewById(R.id.textView2);
        forget_password = (TextView)findViewById(R.id.textView3);
        logo = (ImageView)findViewById(R.id.imageView);
        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editTextTextPassword);
        Google.setOnClickListener(this);
        Sign_in.setOnClickListener(this);
        Create_account.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}
