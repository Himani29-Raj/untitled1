package DumpsQuestions;

public class Jumps {
    public static void main(String[] args) {
        Wooper w = new Wooper();
        System.out.println(w.jump(5) + " ");
       // w.printJumps(5);
    }
}
class Wooper{
    public int jump(int i){
        System.out.print(printJumps(i++) + " ");
        return i;
    }
    private int printJumps(int i){
        System.out.print("Jumps: " + i++ + " ");
        return i;
    }

}

