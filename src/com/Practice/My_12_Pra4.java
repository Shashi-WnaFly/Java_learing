package com.Practice;
import java.util.Scanner;
class TommyVecetti{
    public void running(String h){
        System.out.println("running......");
    }
    public void hitting(String b){
        System.out.println("hitting.....");
    }
    public void firing(String c){
        System.out.println("Firing.....");
    }
}
public class My_12_Pra4 {
    public static void main(String[] arg){
        TommyVecetti hero = new TommyVecetti();
        System.out.println("Enter command in vice city.");
        Scanner go = new Scanner(System.in);
        String fo = go.next();
        hero.firing(fo);
        hero.hitting(fo);
        hero.running(fo);
    }
}
