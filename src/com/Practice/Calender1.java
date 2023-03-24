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

        Scanner nn = new Scanner(System.in);
        System.out.println("Enter a Year and I will show you it is leap or not.");
        int yy = nn.nextInt();
        GregorianCalendar no = new GregorianCalendar();
        System.out.println(no.isLeapYear(yy));
    }
}
