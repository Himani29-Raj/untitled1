package Dumps;
interface DeclareStuff{
    public static final int EASY = 3;
    void doStuff(int t);
}
public class passs implements DeclareStuff{
   public void doStuff(int s){
        s += EASY + ++s;
        System.out.println("s" + s);
    }
    public static void main(String[] args) {
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);
      /*  int x = 6;
        passs p = new passs();
        p.doStuff(x);
        System.out.print("main x = " + x);

    }
    void doStuff(int x){
        System.out.print("doStuff x =" + x++);*/
    }
}
