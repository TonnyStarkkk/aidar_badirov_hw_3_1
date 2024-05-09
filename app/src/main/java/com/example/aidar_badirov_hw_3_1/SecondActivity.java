package com.example.aidar_badirov_hw_3_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    TextView display_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        display_tv = findViewById(R.id.display_tv);
        //Получаем пароль из предыдущего main
        String password = getIntent().getStringExtra("Password");
        //Отображаем пароль в TextView
        display_tv.setText("Ваш пароль: " + password);
    }
}