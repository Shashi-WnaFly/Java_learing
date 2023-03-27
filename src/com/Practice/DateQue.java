package com.Practice;

import java.util.*;

public class DateQue { //Use the Date class in Java to print time in te following format : (21:47:92).
                        // And these methods are deprecated.
    public static void main(String[] args) {
        Date mydate = new Date();
        System.out.println(mydate.getHours()+":"+mydate.getMinutes()+":"+mydate.getSeconds());
    }
}
