public class Foo {
    public void doStuff(int y,String s){
        System.out.println(y);
        System.out.println(s);
    }
    public void moreThings(int x){
        System.out.println(x);
    }
}
class Bat extends Foo{
    public void doStuff(int y,long s){
        System.out.println(y);
        System.out.println(s);
    }
}
class Tests1{
    public static void main(String[] args) {
        Bat b = new Bat();
        b.doStuff(45,4567890);
        b.doStuff(46,"Hello");
        b.moreThings(89);

        Foo f = new Bat();
        f.doStuff(23,"Hi");
        f.moreThings(90);
    }
}
