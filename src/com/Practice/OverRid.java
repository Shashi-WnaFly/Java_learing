package com.Practice;
class meth{
    public void kuku() {
        System.out.println("I am a kuku from meth");
    }
    public void hoho(){
        System.out.println("This is hoho from meth");
    }
}
class meth1 extends meth{
    public void kuku(){
        System.out.println("I am a kuku from meth1");
    }
}
public class OverRid {
    public static void main(String[] args){
        meth ho = new meth1();
        ho.hoho();

    }
}
