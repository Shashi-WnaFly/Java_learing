
package com.Practice;
import java.util.Scanner;
public class My_05_Pra1_1
{

    public static void main(String[] args) {
        Scanner bi = new Scanner(System.in);
        System.out.println("Enter number for subject 1");
        Byte a = bi.nextByte();
        System.out.println("Enter number for subject 2");
        Byte b = bi.nextByte();
        System.out.println("Enter number for subject 3");
        Byte c = bi.nextByte();
        System.out.println("Enter number for subject 4");
        Byte d = bi.nextByte();
        System.out.println("Enter number for subject 5");
        Byte e = bi.nextByte();
        int sum = a+b+c+d+e;
        Float per = sum/5f;
        System.out.println("You have got "+ per +" percent in your exam.");
    }
}
