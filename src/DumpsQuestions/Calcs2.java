package DumpsQuestions;

public class Calcs2 {
    static int root;
    Calcs2(int root){
        this.root = root;
    }

    public static void main(String[] args) {
        Calcs2 c = new Calcs2(42);
        go();
    }
    static void go(){
        System.out.println(++root);
    }
}
