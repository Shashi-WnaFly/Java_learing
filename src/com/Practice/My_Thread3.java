package com.Practice;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a thread.");
    }
}
public class My_Thread3 {
    public static void main(String[] args){
        MyThr go = new MyThr("Shashi");
        System.out.println("The id of this Thread is " +go.getId());
        go.start();
        System.out.println("The name of this Thread is "+go.getName());
    }
}
