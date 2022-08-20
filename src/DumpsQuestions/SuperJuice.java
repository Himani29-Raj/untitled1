package DumpsQuestions;

public class SuperJuice {
   static public int calculateJuice(int seeds){
        return (int) (Math.random()*seeds);
    }

    public static void main(String[] args) {
        System.out.println("" + calculateJuice(1024));
    }
}
