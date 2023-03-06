package com.Practice;
interface tvRemote{
    void switchOn();
    void switchOff();
}
interface SmartRemote extends tvRemote{
    void play();
    void changeChannel();
}
class Tv implements SmartRemote{
    public void switchOff(){
        System.out.println("Switch off...");
    }
    public void switchOn(){
        System.out.println("Switch On...");
    }
    public void play(){
        System.out.println("Playing the song.");
    }
    public void changeChannel(){
        System.out.println("Changing the channel.");
    }
}
public class My_Abstract_3 {
    public static void main(String[] args){
        Tv obn = new Tv();
        obn.play();
        obn.changeChannel();
    }
}
