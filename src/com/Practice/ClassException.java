package com.Practice;
import java.util.Scanner;
class MyExcep extends Exception{
    @Override
    public String toString(){
            return super.toString() + " This is toString";
        }
    @Override
    public String getMessage(){
            return super.getMessage() + " This is getMessage";
        }
}
public class ClassException {
        public static void main(String[] args){
            System.out.println("Please Enter a number.");
            Scanner fc = new Scanner(System.in);
            int num = fc.nextInt();
            if(num<10){
                try{
                    throw new MyExcep();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e);
                    e.printStackTrace();
                }
                System.out.println("My custom Exception in this profile.");
            }
        }
}
