package fr.implement.cruiseapp.utils;

/**
 * @author: Implements
 * @since: 08/03/2022
 */

public class Profile {

    private String email;
    private String username;
    private int permission;


    public Profile(String email, String username, int permission) {
        this.email = email;
        this.username = username;
        this.permission = permission;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() {
        return username;
    }

    public int getPermission() {
        return permission;
    }
}
