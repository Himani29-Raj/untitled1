package TypeCasting;

public class TYpCast {
    public static void main(String[] args) {
        try {
            Object o = new String("HIMANI");
            Object sb = (StringBuffer) o;
            System.out.println(sb);
        }
        catch (ClassCastException c) {
            Object o = new String("HIMANI");
            Object sb = (String) o;
            System.out.println(sb);
        }
        finally {
            System.out.println("ClassCastException Solved");
        }
    }
}
