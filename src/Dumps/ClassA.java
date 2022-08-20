package Dumps;

public class ClassA {
    public void methodA(){
       ClassB classB = new ClassB();
       classB.getValue();
    }
}
class ClassB{
    public ClassC classC;
    public String getValue(){
        return classC.getValue();
    }
}
class ClassC{
    public String value;
    public String getValue(){
        value = "ClassB";
        return value;
    }
}
class D{
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
    }
}
