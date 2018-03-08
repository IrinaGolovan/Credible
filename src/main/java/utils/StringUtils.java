package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class StringUtils {

    public static String generateEmail(String email, String domain){
        DateFormat dateFormat = new SimpleDateFormat("MMMdd_HH:mm", Locale.US);
        Date date = new Date();
        return email + "_" + dateFormat.format(date).replace(":", "").toString() + domain;
    }
}
