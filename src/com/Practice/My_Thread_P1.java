package com.Practice;
class Wel extends Thread{
    public Wel(String name){
        super(name);
    }
    public void run(){
        int j = 0;
        while(j<200){
        System.out.println("Good Morning");
            j++;
        }
    }
}
class Mor extends Thread{
    public void run(){
        int i = 0;
            try {
                while (i < 200) {
                    Thread.sleep(200);
                    System.out.println("Welcome");
                    i++;
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
public class My_Thread_P1 {
    public static void main(String[] args){
        Wel goa = new Wel("Sunny");
        Mor hoa = new Mor();
//        goa.setPriority(Thread.MAX_PRIORITY);
//        hoa.setPriority(Thread.MIN_PRIORITY);
        System.out.println("The name of Thread Wel is "+goa.getName());
        goa.start();
        hoa.start();
    }
}
