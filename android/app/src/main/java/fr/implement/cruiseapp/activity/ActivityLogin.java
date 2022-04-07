package fr.implement.cruiseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import fr.implement.cruiseapp.MainActivity;
import fr.implement.cruiseapp.R;
import fr.implement.cruiseapp.TestActivity;
import fr.implement.cruiseapp.utils.Profile;
import fr.implement.cruiseapp.utils.Utils;

/**
 * @author Implements
 * @since 08/03/2022
 */

public class ActivityLogin extends AppCompatActivity {

    private static Profile profile;

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

            if(email.equalsIgnoreCase("paul.baleydier@gmail.com") || password.equalsIgnoreCase("test123")) {
                Intent i = new Intent(ActivityLogin.this, MainActivity.class);
                startActivity(i);
                finish();
            }

            /*
            if(!email.contains("@")) {
                status.setText("Erreur dans l'email.");
                status.setTextColor(Color.RED);
            }else{
                Intent i = new Intent(ActivityLogin.this, TestActivity.class);
                startActivity(i);
                finish();
                //profile = Utils.getProfileUser("pablo.zapata.dev@gmail.com", "test");
            }

             */



            //System.out.println("Email : " + email.getText() + " | password : " + password.getText());
        });
    }


    public static Profile getProfile() {
        return profile;
    }

    




}