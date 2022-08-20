package DumpsQuestions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Birds2 {
    Birds2(int w,boolean talk){
        ozWeight = w;
        canTalk = talk;
    }
    int ozWeight;
    boolean canTalk;
    int getW(){
        return ozWeight;
    }
    boolean getTalk(){
        return canTalk;
    }
    public String toString(){
        return  "" + getW() + " " + getTalk();
    }

    public static void main(String[] args) {
       ArrayList<Birds2> birds = new ArrayList<>();
       birds.add(new Birds2(1,true));
       birds.add(new Birds2(1,false));
       birds.add(new Birds2(48,false));
       birds.add(new Birds2(32,true));
        System.out.println("medium birds: " + sorter(birds,b -> b.getW() == 32));
       System.out.println("medium birds: " + sorter(birds,b ->{return b.getW() == 32;}));

    }
    static ArrayList<Birds2> sorter(ArrayList<Birds2> blist, Predicate<Birds2> expr){
        ArrayList<Birds2> result = new ArrayList<>();
        for(Birds2 b : blist)
            if (expr.test(b))
                result.add(b);
        return result;
    }
}
