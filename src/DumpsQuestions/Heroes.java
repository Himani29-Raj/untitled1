package DumpsQuestions;

public class Heroes {
    static String s = "-";
    Heroes(){
        this(1);
        s += "h1";

    }
    Heroes(int x){
        s += "h2";
    }
}
class Xmens extends Heroes{
    public static void main(String[] args) {
        new Xmens();
        System.out.println(s);
    }
    Xmens(){
        s += "x ";
    }
}
