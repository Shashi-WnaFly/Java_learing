package com.Practice;

import java.util.Scanner;

public class Armstrong {
    static int count(int p) {
        int k = 0;
        while (p > 0) {
            ++k;
            p /= 10;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z, dupin;
        double arm = 0;
        System.out.println("Enter any number to know it is armstrong or not.");
        int input = in.nextInt();
        dupin = input;
        int power = count(input);
        while (input > 0) {
            z = input % 10;
            arm += Math.pow(z, power);
            input /= 10;
        }
        if (arm == dupin) {
            System.out.println("yes, this is a armstrong number.");
        } else {
            System.out.println("No, this is not an armstrong number.");
        }
    }
}
