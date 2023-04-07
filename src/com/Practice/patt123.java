package com.Practice;

public class patt123 {
    public static void main(String[] args) {
        int i, k, r = 1;
        for (k = 2; k <= 10; k++) {
            int z = 10 - k;
            for (i = 1; i <= z; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
            k++;
            r++;
        }

    }
}
