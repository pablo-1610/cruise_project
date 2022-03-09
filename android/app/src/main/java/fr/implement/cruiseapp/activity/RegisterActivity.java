package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import fr.implement.cruiseapp.R;

/**
 * @author: Implements
 * @since: 08/03/2022
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        // Button register
        findViewById(R.id.register_btn_to_connection).setOnClickListener((view -> {
            finishActivity(1);
            startActivity(new Intent(RegisterActivity.this, ActivityLogin.class));
        }));
        // Button se connecter
        //findViewById(R.id.register_btn_to_connection).setOnClickListener(new RegisterListener());
    }
}