package DumpsQuestions;

public class OretegusFunction {
    public int computeDiscontinuous(int x){
        int r = 1;
        r += 2 * x;
        if((x > 4) && (x < 10)){
            r += 2 * x;
        }else if (x <= 4){
            r += 3 * x;
        } else{
           r += 4 * x;
        }
        r += 5 * x;
        return x;
    }

    public static void main(String[] args) {
        OretegusFunction ofunc = new OretegusFunction();
        System.out.println("OF(11) is: " + ofunc.computeDiscontinuous(11));
    }
}
