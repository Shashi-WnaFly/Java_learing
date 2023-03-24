package com.Practice;
import java.util.*;
public class Calender1 {
    public static void main(String[] args){
        Calendar hoa = Calendar.getInstance();
        System.out.println(hoa.getCalendarType());
        System.out.println(hoa.getTime());
        hoa.add(Calendar.YEAR, 25);
        hoa.add(Calendar.YEAR, -13);
        System.out.println(hoa.getTime());
        System.out.println(hoa.getWeeksInWeekYear());
    }
}
