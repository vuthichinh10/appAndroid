package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText registerName =  findViewById(R.id.RegisterName) ;
        registerName.requestFocus();
        Button gotoRegister = findViewById(R.id.btnRegister);
        gotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nút đăng ký được nhấn
                Intent intent = new Intent(Register.this,MainActivity.class);
                startActivity(intent);
                RequestToServer example = new RequestToServer();
                String url = "http://192.168.1.8/app1/display.php";
                String jsonBody = "{\"userID\": \"3\" ,\"userName\": \"hi\"}"; // Dữ liệu JSON bạn muốn gửi
                example.postRequest(url, jsonBody);
            }
        });
    }
}