package com.Practice;
import java.util.Scanner;
public class Bynary {
    public static void convert(int n){
        if(n==0){
            return;
        }
        else{
            int z = n%2;
            convert(n/2);
            System.out.print(z);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter any number to convert into binary number.");
        Scanner oz = new Scanner(System.in);
        int n = oz.nextInt();
        convert(n);
    }
}
