package Dumps;

public class RR {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("bar");
            }
        }).start();
    }
}