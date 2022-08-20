package DumpsQuestions;
import static xcom.Stuff.*;
import static java.lang.System.out;
public class User {
    public static void main(String[] args) {
        new User().go();
    }
    void go(){
        out.println(doStuff(MY_CONSTANT));
    }
}
