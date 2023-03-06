package com.Practice;

class ThreadPro implements Runnable{
    int i = 0;
    public void run(){
    while(i<100){
        System.out.println("This is a BSc.");
        i++;
        }
    }
}
class ThreadDeg implements Runnable{
    int j = 0;
    public void run(){
        while(j<100){
            System.out.println("This is a BCA.");
            j++;
        }
    }
}
public class My_Thread2 {
    public static void main(String[] args){
        ThreadPro t1 = new ThreadPro();
            Thread go = new Thread(t1);
        ThreadDeg t2 = new ThreadDeg();
            Thread po = new Thread(t2);
        go.start();
        po.start();
    }
}
