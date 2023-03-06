package com.Practice;
public class My_10_Pra1 {
    public static void main (String[] arg){
        //Creating an array of 5 floats and calculate their sum.
        int []goa = new int [4];
        goa[0] = 121;
        goa[1] = 123;
        goa[2] = 125;
        goa[3] = 126;
        float[] weigh = {120.65f, 12.152f, 45.369f, 456.0f, 7.001f};
        float sum = 0.0f;
        int i;
        for(i=0; i<5; i++){
            sum += weigh[i];
        }
            System.out.println(sum);
            System.out.println(goa[0]);
    }
}
