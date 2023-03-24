package com.Practice;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Dates {
    public static void main(String[] args){
        Date son = new Date();
//        System.out.println(son);
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//        Date hi = new Date(2023, 03, 24);
//        System.out.println(son.getDate());
        System.out.println(son.getTime());
    }
}
