package com.Practice;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateQue {
    public static void main(String[] args) {
        //Q2. Use the Date class in Java to print time in te following format : (21:47:92).
        // And these methods are deprecated.

        Date mydate = new Date();
        System.out.println(mydate.getHours()+":"+mydate.getMinutes()+":"+mydate.getSeconds());

        // Q3. Repeat q2 using time api.

        LocalTime jo = LocalTime.now();
        DateTimeFormatter go = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = jo.format(go);
        System.out.println(myTime);

    }
}
