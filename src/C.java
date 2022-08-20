abstract class Aaa{
    abstract void a1();
    void a2(){}
}
class B extends Aaa{
    void a1(){}
    void a2(){}
}
public class C extends B {
    void c1(){}

    public static void main(String[] args) {
        Aaa x = new B();
        C y = new C();
        Aaa z = new C();
        x.a2();
        z.a2();
//        z.c1();
        z.a1();
        y.c1();
        x.a1();
    }
}
