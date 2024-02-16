package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    RelativeLayout manhinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputName = findViewById(R.id.name);
        inputName.requestFocus();
        TextView gotoRegister = findViewById(R.id.referRegister);
        gotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nút đăng ký được nhấn
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
//        manhinh = (RelativeLayout)findViewById(R.id.);
//        manhinh.setBackgroundResource(R.drawable.hinhnen);
    }
}