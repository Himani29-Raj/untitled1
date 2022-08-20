package DumpsQuestions;

import java.util.ArrayList;

public class Benefits2 {
    private static int count = 0;
    private String bene = "00";
    private Benefits2(){
    }
    public static Benefits2 getBenefits2(){
        if(count < 1){
            count++;
            return new Benefits2();
        }
        else
            return null;
    }
    String getBene(){
        return bene;
    }
}
class TestBenes{
    public static void main(String[] args) {
        ArrayList<Benefits2>b = new ArrayList<>();
        b.add(Benefits2.getBenefits2());
        b.add(Benefits2.getBenefits2());
        System.out.println(b + " " + b.get(0).getBene());
    }
}
