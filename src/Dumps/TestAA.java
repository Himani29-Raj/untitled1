package Dumps;
class TestException extends Exception{}
class AAA{
    public String sayHello(String name)throws TestException{
        if(name == null)throw new TestException();
        return "Hello" + name;
    }
}
public class TestAA{
    public static void main(String[] args) {
        try {
            new AAA().sayHello("Aiko");
        }catch (Exception e){
            System.out.println("hhhh");
        }
    }
}
