package com.Practice;
public class My_10_Pra5 {
    public static void main(String[] arg){
        int []arr = {8,90,35,98,57,28,45,0,19,100};
        int i, max = arr[0], min = arr[0];
        for(i=0; i<arr.length; i++){
            int s=arr[i];
            if(s>max){
                max=s;
            }
            else if(s<min) {
                min = s;
            }
        }
        System.out.println("The maximum number in array is "+max);
        System.out.println("The minimum number in array is "+min);
    }
}
