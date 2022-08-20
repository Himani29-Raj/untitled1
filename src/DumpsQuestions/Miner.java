package DumpsQuestions;
class GEm extends Mineral{}
public class Miner {
    static int x = 7;
    static String s = null;
    public static void getWeight(Mineral m){
        int y = 0 / x;
        System.out.println(s + " ");
    }

    public static void main(String[] args) {
        Mineral[] ma = {new Mineral(),new GEm()};
        for (Object o : ma)
            getWeight((Mineral) o);
    }
}
class Mineral{}