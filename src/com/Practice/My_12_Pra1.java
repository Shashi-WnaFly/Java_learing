package com.Practice;
class Employee1{
    int Salary;
    String Name;
    public int getSalary(int Salary){
        return Salary;
    }
    public String getName(String h){
        return Name;
    }
    public String setName(String h){

        return h;
    }
}
public class My_12_Pra1 {
    public static void main(String[] arg){
    Employee1 diya = new Employee1();
    diya.Name = "Mata ji";
    diya.Salary = 23244;
    String b = diya.getName(diya.Name);
    int v = diya.getSalary(diya.Salary);
        System.out.println(diya.Name);
        System.out.println(v);
    String c = "Shashi anand";
            diya.setName(c);
        System.out.println(b);
        System.out.println(c);
    }
}
