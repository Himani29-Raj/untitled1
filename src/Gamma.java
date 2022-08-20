class Fooo{
    private  int x;
    public Fooo(int x){
        this.x=x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}
public class Gamma {
    static Fooo fooBar(Fooo foo){
        foo=new Fooo(100);
        return foo;
    }

    public static void main(String[] args) {
        Fooo foo = new Fooo(300);
        System.out.print(foo.getX() + "-");

        Fooo fooFoo = fooBar(foo);
        System.out.print(foo.getX() + "-");
        System.out.print(fooFoo.getX() + "-");

        foo = fooBar(fooFoo);
        System.out.print(foo.getX() + "-");
        System.out.print(fooFoo.getX());
    }
}
