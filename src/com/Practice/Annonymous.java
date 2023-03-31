package com.Practice;
interface lotus{
//    void redLotus();
    void pinkLotus();
}
class daffodil implements lotus{
    public void pinkLotus(){
        System.out.println("Pink Lotus are one of my favorite");
    }
    public void redLotus(){
        System.out.println("Red Lotus are one of my favorite");
    }
}
public class Annonymous {
    public static void main(String[] args){
        // Annonymous class

//        lotus up = new lotus() {
//            @Override
//            public void redLotus(){
//                System.out.println("Hi... I am a Red Lotus.");
//            }

//            public void pinkLotus(){
//                System.out.println("Hi... I am a Pink Lotus");
//            }
//        };
//        up.pinkLotus();
//        up.redLotus();
        lotus down = new daffodil();
        down.pinkLotus();

        //lamda Expression
        lotus kilo = ()->{
            System.out.println("This is from lambda expressions.");
        };
        kilo.pinkLotus();
    }
}
