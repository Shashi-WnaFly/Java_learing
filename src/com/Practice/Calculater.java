package com.Practice;

import java.util.Scanner;
class MyExCept extends Exception{
    public String toString(){
        return "Please do not enter any number greater than 7000 in multiplication. Or";
    }
    public String getMessage(){
        return "Please do not enter any number greater than 100000 in any operation. ";
    }
}
public class Calculater {
    public static void verify(int a, int b)throws MyExCept{
        if(a>7000 || b>7000){
            throw new MyExCept();
        }
    }
    public static void main(String[] args){
        Scanner top = new Scanner(System.in);
        System.out.println("Enter first number.");
        int num1 = top.nextInt();
        System.out.println("Enter Second number.");
        int num2 = top.nextInt();
        System.out.println("Select an operation to be done with your input. \n\t 1. Addition\n\t 2. Substraction\n\t 3. Multiplication\n\t 4. Division");
        System.out.print("Enter here : ");
        int select = top.nextInt();

        try{
            verify(num1, num2);
        } catch(Exception d){
            System.out.println(d.getMessage());
        }

        switch(select){
            case 1:{
                System.out.println("The Additon of Your Input are : "+ (num1 + num2));
                break;
            }
            case 2:{
                System.out.println("The Substraction of Your Input are : "+(num1 - num2));
                break;
            }
            case 3:{
                try{
                    if(num1>7000 || num2>7000){
                        verify(num1,num2);
                    }
                    else{
                        System.out.println("The Multiplication of Your Input are : " + num1*num2);
                    }
                }
                catch(Exception d){
                    System.out.println(d.toString());
                }
                break;
            }
            case 4:{
               try{
                   System.out.println("The Division of Your Input are : "+ num1/num2);
               }
               catch(Exception d){
                   System.out.println("Please don't divide a number by zero.");
               }
                break;
            }
            default:{
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
