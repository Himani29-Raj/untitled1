package Dumps;

public class m {
    public static void main(String[] args) {
        try {
            doSomething();
        }catch (SpecialException e){
            System.out.println(e);
        }
    }
    static void doSomething()throws SpecialException{
        int[] ages = new int[4];
        ages[4] = 17;
        doSomethingElse();
    }
    static void doSomethingElse()throws SpecialException{
        throw new SpecialException();
       // System.out.println("Thrown at the end of the doSomething() method");
    }

}
class SpecialException extends Exception{}