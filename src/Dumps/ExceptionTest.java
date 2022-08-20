package Dumps;

class SpecialExceptions extends Exception{
    public SpecialExceptions(String message){
        super(message);
        System.out.println(message);
    }
}
public class ExceptionTest{
    public static void main(String[] args) {
        try{
            doSomething();
        }catch (SpecialExceptions e){
            System.out.println(e);
        }
    }
    static void doSomething()throws SpecialExceptions{
        int[] ages = new int[4];
        ages[4] = 17;
        doSomethingElse();
    }
    static void doSomethingElse()throws SpecialExceptions{
        throw new SpecialExceptions("Thrown at end of doSomething() method");
    }
}
