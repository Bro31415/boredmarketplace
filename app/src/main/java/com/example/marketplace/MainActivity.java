package com.example.marketplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstpage = findViewById(R.id.login);
        Intent fpintent = getIntent();

        Button firstpage = (Button)findViewById(R.id.login);
        firstpage.setOnClickListener(v -> {
                Intent loginintent = new Intent(MainActivity.this, LoginActivity.class);
        });
    }
}