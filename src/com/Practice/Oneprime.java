package com.Practice;
import java.util.Scanner;
public class Oneprime {
    public static void main(String[] arg){
        System.out.println("Enter a number.");
        Scanner go = new Scanner(System.in);
        int num = go.nextInt();
        int half = num/2;
        boolean prime=true;
        for(int i=2; i<=half; i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Yes, "+num+" is a prime number.");
        }
        else{
            System.out.println("No, "+num+" is not a prime number.");
        }
    }
}
