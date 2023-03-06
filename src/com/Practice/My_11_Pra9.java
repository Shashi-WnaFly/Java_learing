package com.Practice;
import java.util.Scanner;
public class My_11_Pra9 {
        static float temp(int b){
            return (b*9/5f) + 32;
        }
    public static void main(String[] arg){
        Scanner go = new Scanner(System.in);
        System.out.println("Enter temperature in celcius.");
        int num = go.nextInt();
        System.out.println("Your celcius in fahrenheit is " + temp(num));
    }
}
