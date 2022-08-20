package a;
//public class AAAA{
//    AAAA() {  print();   }
//    void print() { System.out.print("A "); }
//}
class BBBB {
    //    int i =   4;
    static int mx(int s) {
        for (int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }


    public static void main(String[] args) {
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
    }

}