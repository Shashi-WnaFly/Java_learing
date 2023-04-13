package com.Practice;

public class Typecast {
    public static void main(String[] args) {
//        System.out.println(200_000_0000);
//        byte b = 23;
//        byte c = 2;
//        byte a = (byte)(b*c);
//        System.out.println(a);
//        byte v = (byte)257;
//        System.out.println(v);
//        int r = (int)(89.9949f);
//        System.out.println(r);
        byte b = 66;
        char c = 'B';
        short s = 256;
        float f = 34.3f;
        int i = 4533;
        double d = 1.364748;
        double result = (f * b) + (i / c) + (d * s);
        System.out.println(result);
        System.out.println((f * b)+" "+(i / c)+" "+(d * s));
    }
}
