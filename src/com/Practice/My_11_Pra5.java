package com.Practice;
import java.util.Scanner;
public class My_11_Pra5 {
    int fibo(int n){
        int f0=0, f1=1, f2 = 0;
        for(int i =1; i<n; i++){
            f2= f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
    public static void main (String[] arg) {
        System.out.println("Enter fibonacci series no.");
        Scanner go = new Scanner(System.in);
        int num = go.nextInt();
        My_11_Pra5 fun = new My_11_Pra5();
        System.out.println(fun.fibo(num));
    }
}
