package com.Practice;

import java.util.ArrayList;

class Genric <Bq, BB>{
    private int gola;
    private Bq bb;
    private BB BB;

//    public void setBB(Bq BB) {
//        this.BB = BB;
//    }

    public Genric(int gola, Bq bb, BB BB) {
        this.gola = gola;
        this.bb = bb;
        this.BB = BB;
    }

    public BB getBB() {
        return BB;
    }

//    public void setGola(int gola){
//        this.gola = gola;
//    }
    public int getGola(){return gola;}
//    public void setbb(Bq bb){
//        this.bb = bb;
//    }
    public Bq getbb(){
        return bb;
    }
}

public class MyGenerics {
    public static void main(String[] args) {
//        ArrayList <Integer> arrayList = new ArrayList();
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(35);
//        arrayList.add(99);
//        arrayList.add("you");
//        String a = (String)arrayList.get(2);
//        System.out.println(arrayList.get(2));
        Genric <String, Integer> gen = new Genric(12,"Deepak Kumar", 88);
//        gen.setbb("My name is Shashi Anand");/
//        gen.setGola(992);
//        System.out.println(gen.getGola());
//        System.out.println(gen.getbb());
        int t = gen.getGola();
        String de = gen.getbb();
        int k = gen.getBB();
        System.out.println(de);
        System.out.println(k);
    }
}
