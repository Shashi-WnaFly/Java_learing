package com.Practice;

import java.util.Scanner;

// Q3 --> Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 3 print"Error"
public class Q3Exception {
    public static void main(String[] args) {
//        int []Result = new int[5];
        int[] Result = {55, 90, 30, 20, 85};
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the index value of an array.");
        int error = 0;
        while (error < 5) {
            int arr = row.nextInt();
            try {
                System.out.println(Result[arr]);
                break;
            }
            catch (Exception e) {
                System.out.println("Please inter valid index value");
                System.out.println(e.getMessage());
            }
            error++;
        }
        if(error == 5) System.out.println("Error");

    }
}
