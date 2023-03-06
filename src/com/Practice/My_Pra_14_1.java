package com.Practice;
class Circle{
    public int Rad;
    public void setRad(int a) {
        this.Rad = a;
    }
    public void areaCir(){
        System.out.println("The area of the circle is "+(Math.pow(Rad,2)*22/7));
        }
    }
class Cylinder extends Circle{
    public float Radius, height;
    public void setWeiHei(float r, float h){
        Radius = r;
        height = h;
    }
    public void areaCyl(){
        System.out.println("The area of Cylinder is "+ 2*3.14*Radius*(height+Radius));
    }
    public void volCyl(){
        System.out.println("The volume of Cylinder is "+ 3.14 * Math.pow(Radius, 2)*height);
    }
}
public class My_Pra_14_1 {
    public static void main(String[] args){
        Circle cir = new Circle();
        cir.setRad(11);
        cir.areaCir();
        Cylinder cyl = new Cylinder();
        cyl.setWeiHei(8,4);
        cyl.volCyl();
        cyl.areaCyl();
    }
}
