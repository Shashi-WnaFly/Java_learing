package com.Practice;
public class My_11_Pra2 {
    void pat(){
        for(int i =1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        System.out.println("Required pattern are here.");
        My_11_Pra2 jo = new My_11_Pra2();
        jo.pat();
    }
}
