package Dumps;

public class Main {
    public static void main(String[] args){
        try {
            doSomething();
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }
    private static void doSomething()throws Exception{
        System.out.println("Before if clause");
        if (Math.random() > 0.5){
            throw new Exception();
        }
        System.out.println("After if clause");
    }
}
