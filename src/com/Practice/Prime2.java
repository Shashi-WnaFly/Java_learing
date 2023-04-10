package com.Practice;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        int i, n=1; boolean prime = true;
        System.out.println("Enter any number to know its Prime or not.");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        for(i = 2; i*i < input; i++){
            if(input%i==0){
                prime = false;
            }
            n++;
        }
        if(prime){
            System.out.println("Yes it is a prime number.");
        }
        else{
            System.out.println("No it is not a prime number.");
        }
        System.out.println("The number of times loop run is "+ n);
    }
}
