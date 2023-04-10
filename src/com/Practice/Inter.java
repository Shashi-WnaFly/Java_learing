package com.Practice;
class NameOutput{
    String s;
    NameOutput(){
//        String s = new String("My course is BCA");
        s = "My course is BCA";
    }
    public void show(){
        System.out.println(s);
    }
}
public class Inter {
    public static void main(String[] args) {
        NameOutput Name = new NameOutput();
        Name.show();
    }
}
