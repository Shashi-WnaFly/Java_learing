package com.Practice;
class Punk extends Thread{
    public void run() {
        byte j = 0;
        while (j<100) {
            System.out.println("MAX PRIORITY");
            j++;
        }
    }
}
class Punk2 extends Thread{
    public void run(){
        byte i = 0;
        while(i<100){
            System.out.println("Norm Priority");
            i++;
        }
    }
}
class Punk3 extends Thread{
    byte k = 0;
    public void run(){
        while(k<100){
            System.out.println("Min Priority");
            k++;
        }
    }
}
public class My_Thread4 {
    public static void main(String[] args){
        Punk t1 = new Punk();
        Punk2 t2 = new Punk2();
        Punk3 t3 = new Punk3();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
