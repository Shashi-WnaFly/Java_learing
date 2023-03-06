package com.Practice;
import java.util.Scanner;
public class Try_Catch {
    public static void main(String[] args){
        int []marks = new int[3];
        marks[0] = 44;
        marks[1] = 78;
        marks[2] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an array by just entering a number.");
        int i = sc.nextInt();
        System.out.println("Enter any number to to divide the selected array.");
        int num = sc.nextInt();
        try{
            System.out.println("The value of an array after divided by a num is "+marks[i]/num);
        }
        catch(ArithmeticException e){
            System.out.println("EE math tum se na ho payega because reason is "+e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Aukaat se bahar ke baat mat kro because reason is "+e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}