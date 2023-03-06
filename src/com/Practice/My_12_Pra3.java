package com.Practice;
class Rectangle{
    int length, width;
    int side;
    public void area(){
        System.out.println("The area of Rectangle is "+(length*width));
    }
    public void para(){
        System.out.println("The parameter of Rectangle is "+((2*length)+(2*width)));
    }
    public void square(){
        System.out.println("The area of a square is "+Math.pow(side,2));
    }
}
public class My_12_Pra3 {
    public static void main(String[] args) {
        Rectangle go = new Rectangle();
        go.length=12;
        go.width=14;
        go.area();
        go.para();
        go.side=7;
        go.square();
    }
}
