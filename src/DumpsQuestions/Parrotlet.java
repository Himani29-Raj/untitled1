package DumpsQuestions;

class Parrot{
    void chirp(int loud){
        System.out.println("CHIRP");
    }
}
public class Parrotlet extends Parrot{
    void chirp(long loud){
        System.out.println("chirp");
    }

    public static void main(String[] args) {
        Parrotlet bokeh = new Parrotlet();
        bokeh.chirp(420);
        bokeh.chirp(123_456_012);
    }
}
