package Dumps;

public class TestOnes implements Runnable {
    public static void main(String[] args)throws Exception {
        Thread t = new Thread(new TestOnes());
        t.start();
        System.out.print("Started");
        t.join();
        System.out.print("Complete");
    }
    public void run(){
        for (int i = 0;i < 4;i++){
            System.out.print(i);
        }
    }
}
