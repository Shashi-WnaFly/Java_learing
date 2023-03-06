package com.Practice;
import java.util.Scanner;
public class My_10_Pra3 {
    public static void main(String[] arg){
        Scanner go = new Scanner(System.in);
        int sum = 0;
        int []marks = new int [5];
//        int marks[]={54,57,65,77,45};
        System.out.println("Enter Your Marks in Physics.");
        for(int element : marks){
            element = go.nextByte();
            sum += element;
        }
        float avg=sum/5f;
        System.out.println("The Average marks of students is : "+avg);
    }
}
