package com.Practice;
import java.util.Scanner;
public class NestedBlock {
    public static void main(String[] args){
    int []numbers = new int[3];
         numbers[0] = 15;
         numbers[1] = 79;
         numbers[2] = 20;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the index.");
         boolean flag = true;
         while(flag){
             int num = sc.nextInt();
             try{
                     System.out.println("The value of entered index is "+numbers[num]);
                     flag = false;
                 }
             catch(Exception e){
                 System.out.println("Error : " +e);
                }
         }
    }

}
