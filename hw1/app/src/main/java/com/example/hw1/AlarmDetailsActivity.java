package com.example.hw1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class AlarmDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_details);

        // Get data from intent extras
        String label = getIntent().getStringExtra("label");
        long dateTimeInMillis = getIntent().getLongExtra("dateTimeInMillis", 0);

        // Find TextViews
        TextView labelTextView = findViewById(R.id.textViewLabel);
        TextView dateTimeTextView = findViewById(R.id.textViewDateTime);

        // Set data to TextViews
        labelTextView.setText("Label: " + label);
        dateTimeTextView.setText("Date & Time: " + new Date(dateTimeInMillis).toString());
    }
}

