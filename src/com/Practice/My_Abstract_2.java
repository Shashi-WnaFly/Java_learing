package com.Practice;
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends TelePhone{
    public void camera(){
        System.out.println("Opening camera...");
    }
    void ring(){
        System.out.println("tring... tring...");
    }
    void lift(){
        System.out.println("Say Hello!");
    }
    void disconnect(){
        System.out.println("Disconnecting the Phone.");
    }
}

public class My_Abstract_2 {
    public static void main(String[] args){
        SmartPhone hero = new SmartPhone();
        hero.lift();
        hero.camera();
        hero.ring();
        hero.disconnect();
    }
}
