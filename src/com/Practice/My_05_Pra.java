
package com.Practice;
import java.util.Scanner;
public class My_05_Pra {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        System.out.println("Enter three numbers to add");
        System.out.println("Enter number 1");
        int x = he.nextShort();
        System.out.println("Enter number 2");
        int y = he.nextShort();
        System.out.println("Enter number 3");
        int z = he.nextShort();
        int a = x+y+z;
        System.out.print("The addition of three number is equal to ");
        System.out.print(a);
    }
}
