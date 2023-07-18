package com.example.add;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class second extends AppCompatActivity {
     private EditText  n1;
     private EditText n2;
    private TextView result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= findViewById(R.id.tv1text);
        n2= findViewById(R.id.tvtext2);
        result= findViewById(R.id.tvans);
        Button add = findViewById(R.id.button);
        Button back=findViewById(R.id.button2);

        add.setOnClickListener(view -> {
            int num1=Integer.parseInt(n1.getText().toString());
            int num2=Integer.parseInt(n2.getText().toString());
            int sum=num1+num2;
            result.setText(String.format("Answer:%s", sum));
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(second.this, MainActivity.class);
            startActivity(intent);

        });


    }
}