package com.Practice;
class The extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("Namaste");
            i++;
        }
    }
}class The1 extends Thread{
    public void run(){
        int j = 0;
        while(j<50){
            System.out.println("Hello");
            j++;
        }
    }
}

public class My_Thread_Pra3 {
    public static void main(String[] args){
        The hi = new The();
        The1 hi1 = new The1();
        hi.start();
        try{
            hi.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        hi1.start();
    }
}
