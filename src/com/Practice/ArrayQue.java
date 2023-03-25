package com.Practice;
import java.util.*;
public class ArrayQue {
    public static void main(String[] args) {
        //Create a arraylist and store names of 10 students in it. And print it using for-each loop.
        ArrayList<String> jojo = new ArrayList<>();
        jojo.add("Deepak kumar");
        jojo.add("Raja kumar");
        jojo.add("Rizwan Kumar");
        jojo.add("Ankit kumar");
        jojo.add("Navneet kumar");
        jojo.add("Sanjay kumar");
        jojo.add("Rahul kumar");
        jojo.add("Ankur kumar");
        jojo.add("Adarsh kumar");
        jojo.add("vishal kumar");
        for(String element:jojo){
            System.out.println(element);
        }
    }
}
