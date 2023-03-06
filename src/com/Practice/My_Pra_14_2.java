package com.Practice;
class RecTengle{
    public float width, length;
    public void setRec(float a, float b){
        this.width = a;
        this.length = b;
    }
    public void area(){
        System.out.println("The area of Rectangle is "+(width*length));
    }
}
class Cuboid extends RecTengle{
    public float width, length, height;
    public void setWLH(float c, float d, float e){
        this.width = c;
        this.length = d;
        this.height = e;
    }
    public void area(){
        System.out.println("The area of Cuboid is "+2*(width*length+length*height+height*width));
    }
    public void vol(){
        System.out.println("The volume of Cuboid is "+ width*length*height);
    }
}
public class My_Pra_14_2 {
    public static void main(String[] args) {
//        RecTengle rec = new RecTengle();
//        rec.area();
//        Cuboid cub = new Cuboid();
//        cub.setWLH(3.6f,6.6f,8.8f);
//        cub.area();
//        cub.vol();
//        cub.setRec(8.9f,3.3f);
//        cub.area(); // It is the area of Cuboid but i wanted to print the area of rectangle
 //      trying dynamic method dispatch.
        RecTengle rec = new Cuboid();
        rec.setRec(7.7f, 5.5f);
        rec.area();
    }
}
