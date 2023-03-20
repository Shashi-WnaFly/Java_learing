package com.Practice;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> sold = new ArrayList<>();
        ArrayList<Integer> sold1 = new ArrayList<>();
        sold.add(25);
        sold.add(5);
        sold.add(2);
        sold.add(9);
        sold.add(66);
//        sold.add(2, 102);

        sold1.add(333);
        sold1.add(335);
        sold1.add(330);
//        sold.addAll(sold1);
        sold.addAll(2,sold1);
//        sold.clear();
//        System.out.println(sold.contains(330));
//        System.out.println(sold.clone());
        System.out.println(sold.indexOf(335));
        for(int i = 0; i<sold.size(); i++){
            System.out.println(sold.get(i));
        }
    }
}
