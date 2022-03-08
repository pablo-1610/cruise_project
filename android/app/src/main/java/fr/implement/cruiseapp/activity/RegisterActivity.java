package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import fr.implement.cruiseapp.R;
import fr.implement.cruiseapp.listeners.activityregister.RegisterListener;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        // Button register
        findViewById(R.id.register_btn_register).setOnClickListener(new RegisterListener());
        // Button se connecter
        //findViewById(R.id.register_btn_to_connection).setOnClickListener(new RegisterListener());
    }
}