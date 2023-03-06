package com.Practice;
public class My_11_Pra8 {
    static void lobo(int n){
        if(n<5){
            lobo(n+1);
            for(int i=n; i>0; i--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        System.out.println("Printing the pattern.");
        int go = 1;
        lobo(go);
    }
}
