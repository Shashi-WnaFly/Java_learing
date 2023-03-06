package com.Practice;
import java.util.Scanner;
class fruit{
    public float fruit(int r, int b){
        return 2*3.14f*((r*r)+b);}
}
public class My_13_Pra2{
    public static int goa(int num){
        return num;
    }
    public static void main(){
        Scanner go = new Scanner(System.in);
        System.out.println(goa(4));
        System.out.println("Enter Cylinder height");
        int ht = go.nextInt();
        System.out.println("Enter Cylinder radius");
        int rad = go.nextInt();
        fruit hom = new fruit();
        float area = hom.fruit(rad, ht);
        System.out.println("The area of Cylinder is "+ area);


    }
}
