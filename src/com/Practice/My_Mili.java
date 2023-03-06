package com.Practice;
public class My_Mili {
    public static void main(String[] args) {
        try{
            for(int i = 0; i<5; i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
