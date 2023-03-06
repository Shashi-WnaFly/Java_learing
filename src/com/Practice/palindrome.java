package com.Practice;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] arg){
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter any number.");
        int num = sd.nextInt();
        int temp = num, r, sum = 0;

        while(temp>0){
            r = temp%10;
            sum = (sum*10)+r;
            temp = temp/10;
        }
        if(sum==num){
            System.out.println("Yes your number is palindrome.");
        }
        else{
            System.out.println("No your number is not palindrome.");
        }
    }
}
