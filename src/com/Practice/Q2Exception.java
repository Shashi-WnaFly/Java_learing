package com.Practice;

import java.util.Scanner;
public class Q2Exception {
    //Write a Java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        System.out.println("Please enter a number as a dividend");
        int num = ha.nextInt();

        System.out.println("Please enter a number as a divisor");
        int num2 = ha.nextInt();

        System.out.println("Enter any character do you want.");
        String gi = ha.next();

        try {
             System.out.println("The calculation of number is : " + num / num2);
                    System.out.println(gi);
        }
        catch (ArithmeticException e) {
                    System.out.println("HaHa");
        }
        catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}
