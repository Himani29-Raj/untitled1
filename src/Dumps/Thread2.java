package Dumps;

public class Thread2 implements Runnable{
    public void run(){
        System.out.println("run");
        throw new RuntimeException("Problem");
    }

    public static void main(String[] args) {
       // Thread
    }
}
