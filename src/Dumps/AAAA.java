package Dumps;

public class AAAA{
    private int counter = 0;
    public static int getInstanceCount(){
        return(new AAAA(). counter);
    }
    public AAAA(){
        counter++;
    }
}
class BBBB{
    public static void main(String[] args) {
        AAAA a1 = new AAAA();
        AAAA a2 = new AAAA();
        AAAA a3 = new AAAA();
        System.out.println(AAAA.getInstanceCount());
    }
}