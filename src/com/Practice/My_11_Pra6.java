package com.Practice;
public class My_11_Pra6 {
    static float aver(int ...sss){
       float sum = 0, num = 0.0f;
        for(float a: sss){
            sum += a;
            num++;
        }
        return sum/num;
    }
    public static void main(String[] arg){
        System.out.println(aver( 12,25,35,24));
    }
}
