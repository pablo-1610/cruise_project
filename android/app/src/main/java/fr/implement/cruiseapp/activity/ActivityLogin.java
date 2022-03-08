package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import fr.implement.cruiseapp.R;
import fr.implement.cruiseapp.listeners.activitylogin.LoginListener;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        findViewById(R.id.login_btn_to_register).setOnClickListener((view) -> {
            finishActivity(1);
            startActivity(new Intent(ActivityLogin.this, RegisterActivity.class));
        });
        findViewById(R.id.login_connexion).setOnClickListener((view -> {
            System.out.println("Login account");
        }));
    }
}