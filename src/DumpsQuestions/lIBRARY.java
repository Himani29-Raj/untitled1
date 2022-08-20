package DumpsQuestions;

public class lIBRARY {
    int y = 38;

    public static void main(String[] args) {
        int x = 37;
        lIBRARY r = new lIBRARY();
        r.go(r,x);
    }
    void go(lIBRARY r,int z){
        System.out.println(r + " " + z + " " + r.y);
    }
}
