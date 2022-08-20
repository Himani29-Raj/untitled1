package Dumps;
class Base{
    public static final String FOO = "foo";

    public static void main(String[] args) {
       Base b = new Base();
       Subs s = new Subs();
        System.out.println(Base.FOO);
        System.out.println(Subs.FOO);
        System.out.println(b.FOO);
        System.out.println(s.FOO);
        System.out.println(((Base)s).FOO);
    }
}
public class Subs extends Base {
    public static final String FOO = "bar";
}
