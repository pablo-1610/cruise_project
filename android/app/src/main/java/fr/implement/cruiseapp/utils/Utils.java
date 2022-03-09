package fr.implement.cruiseapp.utils;

import com.google.common.hash.Hashing;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author: Implements
 * @since: 08/03/2022
 */

public class Utils {

    private static Gson gson = new Gson();

    private static final int CODE_ERROR = 404;
    private static final String URL = "localhost";

    private Utils(){
        throw new IllegalStateException("Utility class");
    }

    public static boolean hasAccount(String email, String password){
        HttpURLConnection urlConnection = null;

        String passwordHash = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();

        try {
            URL url = new URL(URL);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();

            return urlConnection.getResponseCode() != CODE_ERROR;

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            urlConnection.disconnect();
        }
        return false;
    }

    public static Profile getProfileUser(String email, String password){
        HttpURLConnection urlConnection = null;

        String passwordHash = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();

        try {
            URL url = new URL(URL);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();

            InputStream in = urlConnection.getInputStream();

            return gson.fromJson(readStream(in), Profile.class);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            urlConnection.disconnect();
        }
        return null;
    }

    private static String readStream(InputStream in) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader r = new BufferedReader(new InputStreamReader(in), 1000);
        for(String line = r.readLine(); line != null; line = r.readLine()) sb.append(line);
        in.close();
        return sb.toString();
    }

}
