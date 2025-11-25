package com.example.personalprofilemanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnViewProfiles, btnAddProfile, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewProfiles = findViewById(R.id.btnViewProfiles);
        btnAddProfile = findViewById(R.id.btnAddProfile);
        btnLogout = findViewById(R.id.btnLogout);

        // TODO: Implement View and Add Profile actions


        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LandingActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
