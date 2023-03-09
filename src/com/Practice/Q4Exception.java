package com.Practice;

import java.util.Scanner;

// Q4 --> Write a program that allows you to keep accessing an array util a valid index is given. If max retries exceed 5 throw a custom Exception.
class Custom extends Exception {
    public String toString() {
        return "Let me introduce myself! I starts from 0 and ends with 4";
    }
    public String getMessage(){
        return "Hey TaTa";
    }
}

public class Q4Exception {
    public static void thro() throws Custom {
        throw new Custom();
    }

    public static void main(String[] args) {
        int[] Price = {115, 223, 345, 403, 300};
        int check;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product number.");
        try {
            for (check = 0; check < 5; check++) {
                int arr = input.nextInt();
                try {
                    System.out.println("The Price of the Product is " + Price[arr]);
                    break;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            thro();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}

