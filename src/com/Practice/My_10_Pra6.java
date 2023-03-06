package com.Practice;
public class My_10_Pra6 {
    public static void main (String[] arg){
        int []shashi = {1,24,43,53,55,69,68,86,88,99};
//        int min=shashi[0];
//        Scanner sc = new Scanner(System.in);
        boolean tsorted = false;
        for(int i = 0; i<shashi.length-1; i++){
            if(shashi[i]>shashi[i+1]){
                tsorted = true;
            }
        }
            if(tsorted==true){
                System.out.println("No, this array is not sorted.");
            }
            else{
                System.out.println("Yes, this array is sorted.");
            }
    }
}
