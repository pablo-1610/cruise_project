package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import fr.implement.cruiseapp.R;
import fr.implement.cruiseapp.utils.Utils;

/**
 * @author: Implements
 * @since: 08/03/2022
 */

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        findViewById(R.id.login_btn_to_register).setOnClickListener((view) -> {
            startActivity(new Intent(ActivityLogin.this, RegisterActivity.class));
            finish();
        });

        findViewById(R.id.login_connexion).setOnClickListener((view) -> {
            String email = ((TextView) findViewById(R.id.login_email)).getText().toString();
            String password = ((TextView) findViewById(R.id.login_password)).getText().toString();
            TextView status = findViewById(R.id.login_status_id);

            if(!email.contains("@") && email.isEmpty()) {
                status.setText("Erreur dans l'email.");
            }else{
                // requests de connexion
                //Utils.getProfileUser(email, password);
            }

            //System.out.println("Email : " + email.getText() + " | password : " + password.getText());
        });
    }


}