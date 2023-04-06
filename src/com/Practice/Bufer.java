package com.Practice;
import java.util.Scanner;
public class Bufer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String that u want.");
        String userin = in.nextLine();
        StringBuffer userni = new StringBuffer(userin);
        System.out.println(userni);
        StringBuffer rev = userni.reverse();
        String eq = rev.toString();
        if(eq.equals(userin)){
            System.out.println("This is the palindrome String.");
        }
        else{
            System.out.println("This is not the palindrome String.");
        }
    }
}
