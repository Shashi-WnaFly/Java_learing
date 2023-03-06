package com.Practice;
class BIke extends Thread{
    public void run(){
        while(true){
        System.out.println("Namaste");
        }
    }
}
class bike4 extends Thread{
    public void run(){
        while(true){
        System.out.println("Hello world");
        }
    }
    public static void main(String[] args){
        bike4 t1 = new bike4();
        BIke t2 = new BIke();
        t1.start();
        t2.start();
    }
}