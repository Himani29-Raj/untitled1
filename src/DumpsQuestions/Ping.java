package DumpsQuestions;

public class Ping extends Util {
    public static void main(String[] args) throws Exception{
        Util u = new Ping();
        System.out.println(u.getInt(args[0]));
    }
    int getInt(String a)throws Exception{
        return Integer.parseInt(a);
    }
}
class Util{
    int getInt(String x)throws Exception{
        return 7;
    }
}
