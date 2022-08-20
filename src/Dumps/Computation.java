package Dumps;

public class Computation extends  Thread{
    private int num;
    private boolean isComplete;
    private int result;

    public Computation(int num){
        this.num=num;
    }
    public synchronized void run(){
        result = num*2;
        isComplete = true;
        notify();
    }
    public synchronized int getResult(){
        while (!isComplete){
            try {
                wait();
            }catch (InterruptedException e){

            }
        }
        return result;
    }

    public static void main(String[] args)throws Exception {
        Computation[] computation = new Computation[4];
        for(int i = 0;i < computation.length;i++){
            computation[i] = new Computation(i);
            computation[i].start();
        }
        for (Computation c : computation)
            System.out.print(c.getResult() + "");
    }
}
