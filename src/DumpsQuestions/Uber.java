package DumpsQuestions;

public class Uber {
    static int y = 2;
    Uber(int x){
        this();
        y*=2;
    }
    Uber(){

    }
}
class Minor extends Uber{
    Minor(){
        super(7);
        y+=3;
    }

    public static void main(String[] args) {
        new Minor();
        System.out.println();
    }
}
