public class Thread4 implements Runnable{
    public void run(){
        System.out.print("running");
    }
    public static void main(String[] args) {
        Thread t =new Thread(new Thread4());
        t.run();
        t.run();
        t.start();
    }
}
