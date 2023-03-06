package com.Practice;
public class My_11_Pra7 {
    static void patrec(int n){
        if(n>0){
            patrec(n-1);
            for(int i=1; i<=n; i++){
            System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] arg){
        int num = 4;
        System.out.println("Printing the pattern.");
        patrec(num);
    }
}
