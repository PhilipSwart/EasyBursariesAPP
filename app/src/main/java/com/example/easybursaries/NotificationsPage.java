package com.example.easybursaries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NotificationsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications_page);

        getSupportActionBar().setTitle("Notifications");
    }


}