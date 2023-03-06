package com.Practice;
import java.util.Scanner;
public class My_11_Pra {
 static void table(int a){
    for(int i = 1; i<=10; i++){
        System.out.format("%d X %d = %d\n",a,i,a*i);
        }
        }
    public static void main(String[] arg){
        System.out.println("Enter any number to get a table.");
        Scanner im = new Scanner(System.in);
        int go = im.nextInt();
        table(go);
//        Calc obj = new Calc();
//        obj.table(go);

    }
}
