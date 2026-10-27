package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
    //current date and time
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is:  " + today);
    //print as MM/DD/YYYY
    //        String .format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("formattedDate = " + formattedDate);
    //print as YYYY-MM-DD

    //print as Wednesday, April 22, 2026

    //note: 3 M shorthand 4 M longhand(APR vs April)

    }
}
