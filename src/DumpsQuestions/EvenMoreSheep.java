package DumpsQuestions;

import java.util.function.Predicate;

public class EvenMoreSheep {
    static boolean b = false;

    public static void main(String[] args) {
        EvenMoreSheep s = new EvenMoreSheep();
        EvenMoreSheep s2 = s;
        EvenMoreSheep s3;
        s.go(x -> b == false);
        s.go(x -> s == s2);
      //  s.go(x -> s3 = s);
    }
    void go(Predicate<EvenMoreSheep> e){
        EvenMoreSheep s2 = new EvenMoreSheep();
        if(e.test(s2))
            System.out.print("true ");
        else
            System.out.print("false ");
    }
    static int adder(int x , int y){
        return x + y;
    }
}
