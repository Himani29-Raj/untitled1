package Dumps;

public class Test2 {
    int fvar;
    static int cvar;

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.fvar = 200;
        cvar = 400;
        t.fvar = 200;
        Test2.cvar=400;
    }
}
