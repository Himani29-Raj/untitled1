package Dumps;
interface Foos{
    int bar();
}
public class Sprite {
    public int fubar(Foos foo){
        return foo.bar();

    }
    public void testFoo(){
        fubar(new Foos(){
            public int bar(){
                return 1;
            }
        });
    }

    public static void main(String[] args) {
        new Sprite().testFoo();

    }
}
