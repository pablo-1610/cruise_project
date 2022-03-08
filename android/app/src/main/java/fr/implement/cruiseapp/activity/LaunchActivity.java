package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

import fr.implement.cruiseapp.R;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_launch);
        startApplication();
    }

    public void startApplication(){
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent gameActivityIntent = new Intent(LaunchActivity.this, ActivityLogin.class);
                startActivity(gameActivityIntent);
            }
        }, 3000);
    }


}