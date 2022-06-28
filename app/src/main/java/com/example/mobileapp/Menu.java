package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    Button l_btn,bw_btn,noti_btn,logout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        l_btn = findViewById(R.id.LiveBtn);
        bw_btn = findViewById(R.id.BackwardBtn);
        noti_btn = findViewById(R.id.NotiBtn);
        logout_btn = findViewById(R.id.LogOut);

        l_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),Live.class);
                startActivity(intent1);
            }
        });

        bw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),Backward.class);
                startActivity(intent2);
            }
        });

        noti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(),Image.class);
                startActivity(intent3);

            }
        });

        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Log Out Success",Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getApplicationContext(), Login.class);
                startActivity(intent4);
            }
        });
    }
}