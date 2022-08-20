package Dumps;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int rollnumber;
    String name;
    List cources = new ArrayList();
    Student(int i,String name,List cs){
        this.rollnumber = i;
        this.name=name;
        this.cources=cs;
    }
    public String toString(){
        return rollnumber + " : " + name + " : " + cources;
    }
}
class Test99{
    public static void main(String[] args) {
        List cs = new ArrayList();
        cs.add("Java");
        cs.add("C");
        Student s = new Student(123,"Fred",cs);
        System.out.println(s);
    }
}