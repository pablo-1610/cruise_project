package fr.implement.cruiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        findViewById(R.id.HomeButton).setOnClickListener((view) -> {
            finish();
        });

        findViewById(R.id.TicketButton).setOnClickListener((view) -> {

        });

        findViewById(R.id.BoatInformation).setOnClickListener((view) -> {

        });
    }
}