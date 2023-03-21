package com.Practice;
import java.util.*;
public class LInked {
    public static void main(String[] args){
        LinkedList<Integer> toyRed = new LinkedList<>();
        toyRed.add(45);
        toyRed.add(24);
        toyRed.add(93);
        toyRed.add(78);
        toyRed.add(78);
        toyRed.add(3, 99);
        toyRed.poll();
//        toyRed.remove(3);
//        toyRed.clear();
        System.out.println(toyRed.indexOf(78));
        System.out.println(toyRed.contains(99));
//        for(int i = 0; i<toyRed.size(); i++) System.out.println(toyRed.get(i));
        for(int element : toyRed) System.out.println(element);
    }
}
