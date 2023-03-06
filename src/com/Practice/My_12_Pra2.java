package com.Practice;
class cellphone{
    public void ring(){
        System.out.println("ringing.....");
    }
    public void vib(){
        System.out.println("Vibrating......");
    }
}
public class My_12_Pra2 {
    public static void main(String[] arg){
        cellphone op = new cellphone();
        op.ring();
        op.vib();
    }
}
