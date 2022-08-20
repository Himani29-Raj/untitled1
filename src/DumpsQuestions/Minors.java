package DumpsQuestions;

class Ubers{
    static int y = 2;
    Ubers(int x){
        this();
        y = y *2;
    }
    Ubers(){
        y++;
    }
}
public class Minors extends Ubers{
    Minors(){
        super(y);
        y = y + 3;
    }

    public static void main(String[] args) {
        new Minors();
        System.out.println(y);
    }
}
