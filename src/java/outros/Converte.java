/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author laert
 */
public  class Converte {
    
    private Converte() {}
    
    public static Date toDate(String strDate) {
        if (strDate == null)
            return null;
        String regex = "^(\\d{1,2})/(\\d{1,2})/(\\d{4})";
        if (Pattern.compile(regex).matcher(strDate).matches()) {
            return toDate(strDate, "dd/MM/yyyy");
        }
        regex = "^(\\d{4})-(\\d{1,2})-(\\d{1,2})";
        if (Pattern.compile(regex).matcher(strDate).matches()) {
            return toDate(strDate, "yyyy-MM-dd");
        }
        return null;
    }
    
    
    public static Date toDate(String strDate, String format) {
        try {
            return new SimpleDateFormat(format).parse(strDate);
        } catch (ParseException | NullPointerException ex) {
            return null;
        }
    }
    
    
    public static LocalDate toLocalDate(String strDate) {
        if (strDate == null)
            return null;
        String regex = "^(\\d{1,2})/(\\d{1,2})/(\\d{4})";
        if (Pattern.compile(regex).matcher(strDate).matches()) {
            return toLocalDate(strDate, "dd/MM/yyyy");
        }
        regex = "^(\\d{4})-(\\d{1,2})-(\\d{1,2})";
        if (Pattern.compile(regex).matcher(strDate).matches()) {
            return toLocalDate(strDate, "yyyy-MM-dd");
        }
        return null;
    }

    public static LocalDate toLocalDate(String strDate, String format) {
        try {
            return LocalDate.parse(strDate, DateTimeFormatter.ofPattern(format));
        } catch (DateTimeParseException | NullPointerException ex) {
            System.out.println("sim");
            return null;
        }
    }
    
}
