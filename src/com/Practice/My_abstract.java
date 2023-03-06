package com.Practice;
abstract class Pen{
    abstract void write();
    abstract void reFill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing the nib");
    }
    void write(){
        System.out.println("Write in the copy.");
    }
    void reFill(){
        System.out.println("Please refill the pen.");
    }
}
public class My_abstract {
    public static void main(String[] args){
        FountainPen gel = new FountainPen();
        gel.reFill();
        gel.write();
    }
}
