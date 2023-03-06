package com.Practice;
import java.util.Scanner;
public class My_09_Pra3 {
    public static void main(String[] arg){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter any number");
        int fac = n.nextInt();
        int i, facto=1;
        for(i=1; i<=fac; i++){
            facto *= i;
        }
        System.out.println(facto);
    }
}
