package com.Practice;
import java.util.*;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> MyHash = new HashSet<>();
        MyHash.add(29);
        MyHash.add(23);
        MyHash.add(85);
        MyHash.add(47);
        MyHash.add(19);
        System.out.println(MyHash);
        System.out.println(MyHash.size());
        System.out.println(MyHash.contains(85));
        System.out.println(MyHash.isEmpty());
//        System.out.println(MyHash.spliterator());
    }
}
