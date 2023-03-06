package com.Practice;

class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("I am a sentence from MyThread1.");
            System.out.println("Hello! from MyThread1");
        } catch (Exception e) {
            System.out.println(e);
        }
//        while(true){

//        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
//        while(true){
        System.out.println("My name is MyThread2.");
        System.out.println("Morning! My friends");
//        }
    }
}

public class My_Thread1 {
    public static void main(String[] args) {
        MyThread1 go = new MyThread1();//
        MyThread2 ho = new MyThread2();
        go.start();
        ho.start();
    }
}
