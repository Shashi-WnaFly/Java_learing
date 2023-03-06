package com.Practice;
import java.util.Scanner;
public class My_08_Pra1 {
    public static void main(String[] arg){
        Scanner go =  new Scanner(System.in);
        System.out.println("Enter your marks in sub 1.");
        byte a = go.nextByte();
        System.out.println("Enter your marks in sub 2.");
        byte b = go.nextByte();
        System.out.println("Enter your marks in sub 3.");
        byte c = go.nextByte();
        int sum = a+b+c;
        float tavg = sum/3f;
        if(tavg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("You are passed and your average is : "+ tavg);
        }
        else if(a<33){
            System.out.println("Because you get "+ a +" in subject 1");
            System.out.println("You are fail.");
        }
        else if(b<33){
            System.out.println("Because you get "+ b +" in subject 2");
            System.out.println("You are fail.");
        }
        else if(c<33){
            System.out.println("Because you get "+ c +" in subject 3");
            System.out.println("You are fail.");
        }
        else{
            System.out.println("You are fail. Because your overall marks ("+tavg+") is less than 40%");
        }
    }
}
