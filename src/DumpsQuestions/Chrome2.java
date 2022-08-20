package DumpsQuestions;

class XX{
    void go(){
        System.out.println("X");
    }
}
class YY extends XX{
    void go(){
        System.out.println("y");
    }
}
class ZZ extends XX{
    void go(){
        System.out.println("Z");
    }
}
public class Chrome2 {
    public static void main(String[] args) {
        XX z = new ZZ();
        XX y = new YY();
        ZZ y2 = (ZZ)y;
        z.go();
        y.go();
        y2.go();
    }
}
