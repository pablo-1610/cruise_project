package fr.implement.cruiseapp.listeners.activityregister;

import android.view.View;


public class RegisterListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        System.out.print(view.getId());
    }
}
