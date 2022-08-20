 enum Drinks{
    HORLICKS(15),RUM(12),BEER;
    private int price;
    public int getPrice(){
     return price;
    }
    Drinks(){
        this.price=20;
    }
    Drinks(int price){
        this.price=price;
    }
}
public class Test {
    public static void main(String[] args) {
        Drinks d[] = Drinks.values();
        for (Drinks d1 : d){
            System.out.println(d1.name() + ":" + d1.getPrice());
        }
    }
}
