package DumpsQuestions;

interface TestIF{
    default String m1(){
        return "m1";
    }
    static String m2(){
        return "m2";
    }
    public String m3();
}
public class NewIFs implements TestIF{
    public String m3(){
        return "m3";
    }

    public static void main(String[] args) {
        NewIFs n = new NewIFs();
        System.out.println(n.m1());
        //System.out.println(n.m2());
        System.out.println(TestIF.m2());
        System.out.println(n.m3());
    }
}
