package fr.implement.cruiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import fr.implement.cruiseapp.activity.ActivityLogin;
import fr.implement.cruiseapp.utils.Profile;
import fr.implement.cruiseapp.utils.Utils;

public class TestActivity extends AppCompatActivity {

    private Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }



        this.profile = ActivityLogin.getProfile();

        System.out.println(profile.getEmail() + " : " + profile.getLastName() + " " + profile.getFirstName() + " " + profile.getPermission());

        /*
        findViewById(R.id.username_status).setOnClickListener((view) -> {
            TextView username = findViewById(R.id.username_status);
            username.setText("profile.getUsername()");
        });
        */


        TextView email = findViewById(R.id.email_status);
        email.setText(profile.getEmail());
        email.setTextColor(Color.GREEN);


        TextView firstname = findViewById(R.id.firstname_status);
        firstname.setText(profile.getFirstName());
        firstname.setTextColor(Color.GREEN);


        TextView lastname = findViewById(R.id.lastname_status);
        lastname.setText(profile.getLastName());
        lastname.setTextColor(Color.GREEN);


        TextView pass = findViewById(R.id.password_status);
        pass.setText("pd");
        pass.setTextColor(Color.GREEN);


        TextView perm = findViewById(R.id.permission_status);
        perm.setText(profile.getPermission() + "");
        perm.setTextColor(Color.GREEN);




    }
}