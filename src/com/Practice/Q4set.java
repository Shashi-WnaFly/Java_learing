package com.Practice;
import java.util.*;
public class Q4set {
    public static void main(String[] args) {
        HashSet<Integer> myH = new HashSet<>();
        myH.add(39);
        myH.add(45);
        myH.add(12);
        myH.add(13);
        myH.add(39); // can't print out in terminal because it is a duplicate element.
        for(Integer element:myH){
            System.out.println(element);
        }
    }
}
