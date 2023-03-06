package com.Practice;
import java.util.Scanner;
public class My_09_Pra2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get a table.");
        short num = sc.nextShort();
        byte i = 1;
        while(i<=10){
            System.out.printf("%d X %d = %d\n", num, i, num*i);
            i++;
        }
    }
}
