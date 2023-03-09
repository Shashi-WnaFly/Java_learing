package com.Practice;

// Q5 --> Wrap the program no. Q4 inside a method which throw a custom exception.
import java.util.Scanner;
class Exceptor extends Exception{
    public String toString(){
        return "Please enter a valid index value.";
    }
}
public class Q5Exception {
    public static void checker(int jok)throws Exceptor{
        int []pens = {15, 20, 10, 30, 50};
        try{
            System.out.println(pens[jok]);
        }
        catch(Exception e){
            throw new Exceptor();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter an index value.");
        Scanner don = new Scanner(System.in);
        int arro = don.nextInt();
        try{
            checker(arro);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
