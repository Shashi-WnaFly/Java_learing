package com.Practice;
public class My_10_Pra4 {
    public static void main(String[] arg){
        int i, j;
        int [][]arr = {{1,3,5},{1,4,6},{8,9,0}};
        int [][]brr = {{1,3,4},{3,2,5},{7,0,6}};
        int [][]crr = {{0,0,0},{0,0,0},{0,0,0}};

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                crr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        System.out.println("First matrix :");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Second matrix :");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The sum of two matrices are : ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
