package com.Practice;
import java.util.Scanner;
public class My_11_Pra4 {
    static void voar(){
        for(int i = 4; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] arg){
        System.out.println("Enter any symbol.");
        Scanner cg = new Scanner(System.in);
//        int d = cg.nextInt();
//        My_11_Pra2 go = new My_11_Pra2();
        voar();
    }
}
