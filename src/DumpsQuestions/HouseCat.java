package DumpsQuestions;

class Felines{
    String makeNoise(){
        return "growl";
    }
}
public class HouseCat extends Felines {
    String makeNoise(){
        return "meow";
    }

    public static void main(String[] args) {
        HouseCat c = new HouseCat();
        c.go(c);
    }
    void  go(HouseCat h){
        System.out.print(this.makeNoise() + " " + super.makeNoise());
        if (this == h)
            System.out.println(" equal");
    }
}
