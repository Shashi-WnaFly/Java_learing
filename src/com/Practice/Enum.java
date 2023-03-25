package com.Practice;

enum WeekDays{
    sun, mon, tues, wed, thurs, fri, sat
}
public class Enum {
    public static void main(String[] args) {
        WeekDays tur;
        tur = WeekDays.mon;
        System.out.println("Today is "+tur);
    }
}
