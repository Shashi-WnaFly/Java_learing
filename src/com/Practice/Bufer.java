package com.Practice;
import java.util.Scanner;
public class Bufer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String and check whether is String is palindrome or not.");
        String userin = in.nextLine();
        StringBuffer userni = new StringBuffer(userin);
        userni.reverse();
        String eq = userni.toString();

        if(eq.equals(userin)){
            System.out.println("This is the palindrome String.");
        }
        else{
            System.out.println("This is not the palindrome String.");
        }
    }
}
