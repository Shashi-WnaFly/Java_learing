package com.Practice;
public class My_10_Pra2 {
    public static void main(String[] arg){
        int []hero = {87,93,38,29,20,40,50,74};
        int i, n=75;
        for(i=0; i<hero.length; i++){
            System.out.println(hero[i]);
            if(hero[i] == n){
                System.out.println("Yes.");
            }
        }
        System.out.println(hero.length);
    }
}
