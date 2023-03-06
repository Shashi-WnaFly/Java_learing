package com.Practice;
import java.util.Scanner;
public class My_10_Pra {
    public static void main(String[] arg){
        int []arr = {8,90,35,98,57,28,45,0,19};
        int mid = Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0; i<=mid; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i-1];
            arr[arr.length - i - 1]  = temp;
        }
        for(int element: arr){
            System.out.println(element);
        }
    }
}
