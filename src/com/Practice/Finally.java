package com.Practice;
import java.util.Scanner;

class ArithException extends Exception{
    public String toString(){
        return super.toString() + " : Please use the number greater than 0 ";
    }
    public String getMessage(){
        return super.toString() + " Please use the number greater than 0 ";
    }
}
public class Finally {
    public static int groo(int n)throws ArithException{
        if(n<=0){
            throw new ArithException();
        }
        else{
            return n;
        }
    }
    public static void main(String[] args){
        int x = 102, y;
        System.out.println("Please enter a nunber to divide a unknown number.");
        Scanner yo = new Scanner(System.in);
//        boolean check = true;
        while(true){
            int num = yo.nextInt();
            try{
                System.out.println("Here is the result of calculation : "+x/groo(num));
                break;
            }
            finally{  //Even though program had been break but finally keyword express itself.
                System.out.println("Yes It is finally.");
            }
        }
    }
}
