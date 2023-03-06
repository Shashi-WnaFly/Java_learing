package com.Practice;
public class My_07_Pra {
    public static void main (String[] arg) {
        String name;
        name = new String("ShashiAnand");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(8));
        System.out.println(name.substring(0,5));
        System.out.println(name.replace('A', 'a'));
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("and"));
        System.out.println(name.charAt(9));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', 3));
        System.out.println(name.lastIndexOf('n'));
        System.out.println(name.lastIndexOf('n', 8));
        System.out.println(name.equals("ShashiAnand"));
        System.out.println(name.equalsIgnoreCase("shashiAnAnd"));
    }
}
