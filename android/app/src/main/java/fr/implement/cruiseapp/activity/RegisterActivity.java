package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

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

        findViewById(R.id.register_email).setOnClickListener((view) -> {
            String email = ((TextView) findViewById(R.id.register_email)).getText().toString();
            TextView status = findViewById(R.id.register_status);

            if(!email.contains("@")){
                status.setText("Erreur dans l'email");
                status.setTextColor(Color.RED);
            }
        });

        findViewById(R.id.register_password).setOnClickListener((view) -> {
            String password = ((TextView) findViewById(R.id.register_password)).getText().toString();
            TextView status = findViewById(R.id.register_status);

            if(password.length() < 5){
                status.setText("Erreur votre mots de passe est trop petit < 5");
                status.setTextColor(Color.RED);
            }
        });
    }
}