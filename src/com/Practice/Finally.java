package com.Practice;

import java.util.Scanner;

class ArithException extends Exception {
    public String toString() {
        return super.toString() + " : Please use the number greater than 0 ";
    }

    public String getMessage() {
        return super.getMessage() + " Please use the number greater than 0 ";
    }
}

public class Finally {
    public static float groo(float n) throws ArithException {
        float x = 102;
        if (n < 1) {
            throw new ArithException();
        }
        return (x / n);
    }

    public static void main(String[] args) {
        System.out.println("Please enter a nunber to divide a unknown number.");
        Scanner yo = new Scanner(System.in);
//        boolean check = true;
        while (true) {
            try {
                float num = yo.nextFloat();
                System.out.println("Here is the result of calculation : " + groo(num));
                break;
            }
             catch (Exception e) {
                System.out.println(e.getMessage());
            }
             finally {  //Even though program had been break but finally keyword express itself.
                System.out.println("Yes It is finally.");
            }
        }
    }
}

