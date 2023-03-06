package com.Practice;
class Gop extends Thread{
    public void run(){
        System.out.println("PRIORITY 1");
    }
}
class Pop extends Thread{
    public void run(){
        System.out.println("PRIORITY 2");
    }
}
public class My_Thread_Pra2 {
    public static void main(String[] args){
        Pop r1 = new Pop();
        Gop r2 = new Gop();
        r1.setPriority(10);
        r2.setPriority(7);
        System.out.println(r2.getPriority());
        System.out.println(r1.getPriority());
        System.out.println(r1.getState());
        r1.start();
        System.out.println(r1.getState());
        System.out.println(r1.currentThread());
    }
}
