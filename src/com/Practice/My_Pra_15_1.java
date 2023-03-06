package com.Practice;
interface gen{
    void shahsi();
    void goa();
    void talkStatus();
   default void patna(){
       System.out.println("I live in Patna.");
   }
        }
abstract class Hari{
    void blowHorn(){
        System.out.println("poooo....");
    }
   abstract void playMusic();
}
class Gopi extends Hari implements gen{
   public void shahsi(){
        System.out.println("My name is Shashi Anand");
    }
   public void goa(){
        System.out.println("Lets go goa.");
    }
    public void talkStatus(){
        System.out.println("Can I Talk To You");
    }
    void playMusic(){
        System.out.println("la la la.....");
    }
}
public class My_Pra_15_1 {
    public static void main(String[] args){
        Gopi sc = new Gopi();
        sc.blowHorn();
        sc.playMusic();
        sc.goa();
        sc.talkStatus();
        sc.shahsi();
        sc.patna();
    }
}
