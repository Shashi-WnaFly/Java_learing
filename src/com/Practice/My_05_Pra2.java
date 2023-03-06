
package com.Practice;
import java.util.Scanner;
public class My_05_Pra2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = n.nextLine();
        System.out.print("Hello " + name + " , Have a good day!");
        System.out.printf("Hello %s, Have  good day!", name);
//         System.out.print(name);
//        System.out.println(", Have a good day!");
    }
}
