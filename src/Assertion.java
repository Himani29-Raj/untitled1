public class Assertion {
    public void go(int x){
        assert (x>0);
        switch (x){
            case 2:;
            default:assert false;
        }
    }
    private void go2(int x){assert (x<0);}

    public static void main(String[] args) {

    }
}
