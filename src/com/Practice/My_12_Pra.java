package com.Practice;
    class Employee{
        int id;
        String name;
        float salary;
        public void printdetails(){
            System.out.println("Your id is "+id);
            System.out.println("Your name is "+name);
            System.out.println("Your salary is "+salary);
        }
        public float getsalary(){
            return salary;
            }
    }
public class My_12_Pra {
    public static void main(String[] arg){
//        System.out.println("Enter Your Name please.");
        Employee goa = new Employee();
        Employee shashi = new Employee();
        shashi.id = 98;
        shashi.name = "Shashi Anand";
        shashi.salary = 23233.2f;
        goa.id = 76;
        goa.name = "Himanshu kumar";
        goa.salary = 234.122f;
        shashi.printdetails();
        goa.printdetails();
        System.out.println(goa.getsalary());

    }
}
