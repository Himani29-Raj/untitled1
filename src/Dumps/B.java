package Dumps;
class AX{
    private static int counter = 0;
    public static int getInstancecount(){
        return counter;
    }
    public AX(){
      counter++;
    }

}
public class B {
    public static void main(String[] args) {
        AX a1  =new AX();
        AX a2 = new AX();
        AX a3 = new AX();
        System.out.println(AX.getInstancecount());
    }
}
