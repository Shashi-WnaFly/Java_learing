package com.Practice;
interface lotus{
    void redLotus();
    void pinkLotus();
}
public class Annonymous {
    public static void main(String[] args){
        lotus up = new lotus() {
            @Override
            public void redLotus(){
                System.out.println("Hi... I am a Red Lotus.");
            }

            public void pinkLotus(){
                System.out.println("Hi... I am a Pink Lotus");
            }
        };
        up.pinkLotus();
        up.redLotus();

    }
}
