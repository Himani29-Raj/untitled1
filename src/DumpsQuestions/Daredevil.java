package DumpsQuestions;

public class Daredevil {
    public static void main(String[] args) throws Exception{
        go();
        System.out.println("main");
    }
    static  void go()throws Exception{
        go2();
        System.out.println("go");
    }
    static void go2()throws Exception{
        System.out.println("go2");
        throw new Exception();
    }
}
