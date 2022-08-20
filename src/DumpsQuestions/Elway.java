package DumpsQuestions;

public class Elway {
    public static void main(String[] a) {
        if(a.length == 0) System.exit(0);
        try{
            final int x = Integer.parseInt(a[0]);
            final int y = new Elway().go(x);
            System.out.println(new Elway().go(y));
        }catch (Exception x){
            System.out.println("parse boo boo");
        }
    }
    int go(int z){
        return z++;
    }
}
