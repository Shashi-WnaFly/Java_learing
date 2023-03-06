package com.Practice;
interface BasicAnimal{
    void eat();
    void sleep();
}
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
class Human extends Monkey implements BasicAnimal{
    public void intelligent(){
        System.out.println("Human are intelligent.");
    }
    public void eat(){
        System.out.println("eating pizza...");
    }
    public void sleep(){
        System.out.println("Sleeping.....");
    }
    void bite(){
        System.out.println("Bitting....");
    }
    void jump(){
        System.out.println("Jumping...");
    }
}
public class My_Abstract_1 {
    public static void main(String[] args){
        Human yot = new Human();
        yot.eat();
        yot.bite();
        yot.jump();
        yot.intelligent();
        yot.sleep();
    }
}
