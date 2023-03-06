package com.Practice;
class Base{
    private int roll;
    public void setRoll(int a){
         this.roll = a;
    }
    public int getRoll(){
        return roll;
    }
}
class Base1 extends Base{
    private int sr_no;

    public int getSr_no() {
        return sr_no;
    }
    public void setSr_no(int b) {
        this.sr_no = b;
    }
}

public class Practice_14_0 {
    public static void main(String[] args) {
        Base1 obj1 = new Base1();
        obj1.setRoll(45);
        System.out.println(obj1.getRoll());
        Base obj = new Base();
        obj.setRoll(23);
        System.out.println(obj.getRoll());
        obj1.setSr_no(99);
        System.out.println(obj1.getSr_no());
    }
}
