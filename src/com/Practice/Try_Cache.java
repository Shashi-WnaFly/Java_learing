package com.Practice;

public class Try_Cache {
    public static void main(String[] args){
        int i = 6000;
        int j = 0;
        try{
            int k = i/j;
            System.out.println(k);
        }
        catch(Exception e){
            System.out.println("Ae bhaiba ee nhi hoga reason hau : "+e);
        }
        System.out.println("End of the program.");
    }
}
