
package com.Practice;
import java.util.Scanner;

public class DecimalToBin {
    public static void main(String[] args) {
        System.out.println("Enter a number to get its binary number.");
        Scanner go = new Scanner(System.in);
        int num = go.nextInt();
        int temp;
        int[] rem = new int[8];
        for (int i = 0; num != 0; i++) {
            rem[i] = num % 2;
            num = num / 2;
        }
        for (int j = 0; j < rem.length / 2; j++) {
            temp = rem[j];
            rem[j] = rem[rem.length - 1 - j];
            rem[rem.length - 1 - j] = temp;
        }
        for(int j = 0; j < rem.length; j++) {
            System.out.print(rem[j]);
        }

    }
}
