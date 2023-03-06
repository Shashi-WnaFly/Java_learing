
package com.Practice;
import java.util.Scanner;
public class DecToBin {
    public static void main(String[] arg){
        Scanner no = new Scanner(System.in);
        System.out.println("Enter any decimal number.");
        int num = no.nextInt();
        int b, sum = 0, i = 1, temp=num;
        while(num>0) {
            b = num % 2;
            sum += b*i;
            i *= 10;
            num = num / 2;
        }
        System.out.print("The binary number of "+temp+" is "+sum);
    }
}
