public class OrteogorumFunction {
    public int computeDiscontinuous(int x){
        int r = 1;
        r += x;
        if ((x > 4) && (x < 10)){
            r += 2 * x;
        }
        //else (x <= 4){
          //  r += 3*x;
        //}
        else{
            r = 5*x;
        }
        r += 5*x;
        return r;
    }

    public static void main(String[] args) {
        OrteogorumFunction o =new OrteogorumFunction();
        System.out.println("OF(11) is: " + o.computeDiscontinuous(11));
    }
}
