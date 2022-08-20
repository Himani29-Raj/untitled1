import java.io.Serializable;

public class Animals {
    Animals(){
        System.out.print("a");
    }
}
class Dog extends Animals implements Serializable{
    Dog(){
        System.out.print("d");
    }
}
class Beagle extends Dog{
    public static void main(String[] args) {
        Beagle b = new Beagle();
    }
}
