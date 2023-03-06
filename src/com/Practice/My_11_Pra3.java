package com.Practice;
import java.util.Scanner;
public class My_11_Pra3 {
    static void recur() {
//        if(n==1 || n==0){
//            return 1;
//        }
//        else{
//            return n + recur(n-1);
//        }
//    }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of ten natural number is :" + sum);
    }
        public static void main(String[] arg){
        recur();
//        Scanner go = new Scanner(System.in);
//        System.out.println("Enter any number.");
//        int v = go.nextInt();
//        int c = recur(v);
//        System.out.println("First Sum of ten natural number is : "+c);
    }
}
