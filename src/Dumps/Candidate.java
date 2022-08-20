package Dumps;

class MissingInfoException extends Exception{}
class AgeOutOfRangeException extends Exception{}

public class Candidate {
    String name;
    int age;
    Candidate(String name,int age)throws Exception{
        try{
        if (name == null){
            throw new MissingInfoException();
        }else if (age <= 10 || age >= 150){
            throw new AgeOutOfRangeException();
        }else {
            this.name=name;
            this.age=age;
        }}catch (Exception e){}
    }
    public String toString(){
        return name + " age: " + age;
    }
}
class Test6{
    public static void main(String[] args)throws Exception {
        Candidate c = new Candidate("James",20);
        Candidate c1 = new Candidate("Williams",32);
        System.out.println(c);
        System.out.println(c1);
    }
}
