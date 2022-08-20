package DumpsQuestions;

interface MyIf{
    static String m2(){
        return "m2 ";
    }
}

public class Raven implements MyIf {
    static String m2(){
        return "m2.2";
    }

    public static void main(String[] args) {
        Raven n = new Raven();
        System.out.println(n.m2());
        System.out.println(MyIf.m2());
        System.out.println();
    }
}
