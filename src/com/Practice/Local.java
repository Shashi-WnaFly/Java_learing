package com.Practice;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
public class Local {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate gh = LocalDate.parse("2022-12-19");
        System.out.println(ld);
        System.out.println(gh.equals(ld));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter j = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String top = j.format(ldt);
        System.out.println(top);
    }
}
