package DumpsQuestions;

public class Useful {
    int increment(int x){
        return ++x;
    }
}
//import DumpsQuestion.*;
class Needy3{
    public static void main(String[] args) {
        Useful u = new Useful();
        System.out.println(u.increment(5));
    }
}
