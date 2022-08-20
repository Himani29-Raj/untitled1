 public class X {
    private static void m1() {

    }
void m2(){
        new X().m2();
}
     public static void main(String[] args) {
         m1();
     }
}
class Y extends X{
    protected void m1(){

    }
}
