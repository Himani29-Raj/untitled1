package DumpsQuestions;

public class X {
    public String markTheSpot(){
        return "X";
    }
}
class Y extends X{
    public String markTheSpot(){
        return "Y";
    }
}
class Z extends Y{
    public String markTheSpot(){
        return "Z";
    }
}
class A extends Z{}
class Indiana{
    public static void main(String[] args) {
        System.out.println(new A().markTheSpot() + " never,ever marks the spot");
    }
}
