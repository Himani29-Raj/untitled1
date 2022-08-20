package Dumps;

public class Donkey2 {
    static boolean assertsOn;
    public static void main(String[] args) {
      ///  boolean assertsOn = true;
        assert(assertsOn) : assertsOn = true;
        if(assertsOn){
            System.out.println("assert is on");
        }
    }
}
