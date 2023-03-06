package com.Practice;
class Goaa implements Runnable{
    public void run(){
        byte i = 0;
        while(i<111){
            System.out.println("This is the Runnable implements Practice.");
            i++;
        }
    }
}
public class My_Runab {
    public static void main(String[] args){
        Goaa my = new Goaa();
//        Thread you = new Thread(my);
//        you.start();
        new Thread(my).start();
    }
}
