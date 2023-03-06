package com.Practice;
import java.util.Scanner;
public class RevisionOf {
    public static void main(String[] args){
        int []marks = {13, 14, 34, 59, 390, 303, 30};
        int temp, l = marks.length/2, lb=marks.length;
        for(int i = 0; i<l; i++){
            temp = marks[i];
            marks[i] = marks[lb-1-i];
            marks[lb-1-i] = temp;
        }
        for(int j = 0; j<marks.length; j++){
            System.out.print(" "+marks[j]+" ");
        }
    }
}
