package com.Practice;
class Base2{
    public Base2(){
        System.out.println("I am a constructor of Base2.");
    }
}
class Derived1 extends Base2{
    public Derived1(){
        System.out.println("I am a constructor of Derived1.");
    }
}
class Derived2 extends Derived1{
    public Derived2(){
        System.out.println("I am a constructor of Derived2.");
    }
}

public class My_Pra_14_3 {
    public static void main(String[] args) {
        Derived2 sc = new Derived2();
    }
}
