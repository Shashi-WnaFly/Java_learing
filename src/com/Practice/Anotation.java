package com.Practice;
@FunctionalInterface
interface java{
    void java1();
//    void java2();
}

class hamza{
    public void sci(){
        System.out.println("I am from hamza's sci");
    }
    @Deprecated
    public void hap(){
        System.out.println("I am Happy now");
    }
}
class urad extends hamza{
    @Override
    public void sci(){
        System.out.println("I am from urad's sci");
    }
}
public class Anotation {
    @SuppressWarnings( "deprecation" )
    public static void main(String[] args){
        urad fun = new urad();
        fun.sci();
        fun.hap();
    }
}
