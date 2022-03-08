package fr.implement.cruiseapp.listeners.activitylogin;

import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;

import fr.implement.cruiseapp.R;
import fr.implement.cruiseapp.activity.ActivityLogin;
import fr.implement.cruiseapp.activity.LaunchActivity;
import fr.implement.cruiseapp.activity.RegisterActivity;

public class LoginListener implements View.OnClickListener{

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.login_connexion){
            System.out.println("Login account");

        }else if(view.getId() == R.id.login_btn_to_register){


        }

    }
}
