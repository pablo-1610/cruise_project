package fr.cruiseapp.api.security;

public class AuthTokenManager {
    private static AuthTokenManager INSTANCE = new AuthTokenManager();

    public static AuthTokenManager getInstance() {
        return (INSTANCE);
    }

    private String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    public String generateToken(){
        return generateUUID();
    }
}
