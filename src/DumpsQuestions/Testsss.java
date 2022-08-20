package DumpsQuestions;

public class Testsss {
    public static void main(String[] args) {
        Testsss t = new Testsss();
        t.start();
    }
    void start(){
        String s1 = "one";
        String s2 = alter(s1);
        System.out.print(s1 + " " + s2);
    }
    String alter(String s1){
        s1 = s1 + " two ";
        System.out.print(s1 + " ");
        return "three";
    }
}