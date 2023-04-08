package com.Practice;

public class Pyramid123 {
    public static void main(String[] args){
        char k = 'A';
       for(int i = 1; i <= 6; i++){
           for(int j = 1; j <= i; j++){
               System.out.print(k+" ");
               k++;
           }
           System.out.println();
       }
    }
}
