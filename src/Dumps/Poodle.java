package Dumps;

abstract class Dog{
    public abstract void bark();
}
public class Poodle extends Dog {
    public void bark(){
        System.out.println("woof");
    }
}
