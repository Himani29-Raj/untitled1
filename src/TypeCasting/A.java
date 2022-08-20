package TypeCasting;

public class A {
    void m1(){
        System.out.println("A");
    }
}
class B extends A{
    void m2(){
        System.out.println("B");
    }
}
class C extends B{
    void m3(){
        System.out.println("C");
    }
}
class Demos{
    public static void main(String[] args) {
        C cobj = new C();
        cobj.m1();
        cobj.m2();
        cobj.m3();
        ((B)cobj).m2();
        ((B)cobj).m1();
    }
}
