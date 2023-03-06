package com.Practice;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] arg){
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number please .......");
        int n = sc.nextInt();
        int b = n;
        for(i=1; i<=n; i++){
            b--;
            for(j=b; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
