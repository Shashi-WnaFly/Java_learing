package com.Practice;
public class My_07_Pra3 {
    public static void main (String[] arg) {
        String newton = "NEWTON WAS A VERY KIND HEARTED OF PERSON. HE HAD NOT THE LEAST OF PRIDE IN SPITE OF HIS BEING SO WISE OF. HIS NATURE WAS SO SOFT THAT HE OF NEVER BECAME ANGRY.";
        System.out.println(newton.charAt(0));
        for (int i = 0; i < newton.length(); i++) {
            if(newton.charAt(i)==' '){
                newton = newton.substring(0, i) + '_' + newton.substring(i + 1);

            }
        }
        System.out.println(newton);
//     System.out.println(newton.replace(' ','_'));
//        String no = "Dear <|name|>, thanks a lot";
//        String na = "Sunny kumar";
//      String str =  newton.replaceAll("OF","bro code");
////        System.out.println(no.replace("name",na ));
//        System.out.println(str);
    }
}
