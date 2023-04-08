package com.Practice;

public class Pattern_1 {
    public static void main(String[] args) {
        int i , j, k, n = 5, p = 1;
        for(i = 0; i<n; i++){
            int z = n-i;
            for(j = 0; j < z; j++){
                System.out.print(" ");
            }
            for(k = 0; k <= i; k++){
                System.out.print(p+i+" ");
            }
            System.out.println();
            p++;
        }
    }
}
