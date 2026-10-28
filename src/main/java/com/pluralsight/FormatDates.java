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
        System.out.println("1st formattedDate = " + formattedDate);
    //print as YYYY-MM-DD
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate2 = today.format(formatter2);
        System.out.println("2nd formattedDate = " + formattedDate2);
    //print as Wednesday, April 22, 2026
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        String formattedDate3 = today.format(formatter3);
        System.out.println("3rd formattedDate = " + formattedDate3);
    //note: 3 M shorthand 4 M longhand(APR vs April)
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formattedDate4 = today.format(formatter4);
        System.out.println("3rd formattedDate = " + formattedDate4);

    }
}
