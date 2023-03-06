package com.Practice;
import java.util.Scanner;
class NegativeArithmeticException extends Exception{
    public String toString(){
        return "Please don't enter Negative number.";
    }
    public String getMessage(){
        return "Please don't enter Negative numbers.";
    }
}
public class Throws {
    public static double area(int r)throws NegativeArithmeticException{
        if(r<0){
            throw new NegativeArithmeticException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args){
        System.out.println("Please enter a Radius of circle.");
        Scanner awg = new Scanner(System.in);
        boolean har = true;
        while(har) {
        int num = awg.nextInt();
            try {
                System.out.println("The area of the circle is " + area(num));
                har = false;
            } catch (Exception e) {
//                System.out.println(e.getMessage());
                System.out.print(e);
            }
        }
    }
}
