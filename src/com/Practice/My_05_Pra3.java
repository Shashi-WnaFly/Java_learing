
package com.Practice;
import java.util.Scanner;
public class My_05_Pra3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter kilometer");
        float value = input.nextFloat();
        float mile = value*(0.621f);
        System.out.println("The kilometer is equal to ");
        System.out.print(mile);
        System.out.println(" miles");
    }
}
