package com.Practice;
import java.awt.*;

class Bike{
    String name;
    int n , b;
    public Bike(){
        name = "Harischandra kumar";
        n = 2005;
        b = 224;
    }
    public int Bike(int b){
        b=45;
        return b;
    }
    public int getval(){
        return n;
    }
    public String setval(){
        System.out.println("My name is Shashi anand");
        return name;
    }
}
public class My_13_Pra1 {
    public static void getval(){
        System.out.println("Akshay kumar");
        System.out.println(2034);
        System.out.println(2233);
    }
    public static void main(String[] arg){
        Bike go = new Bike();
        System.out.println(go.getval());
        System.out.println(go.setval());
    }
}
