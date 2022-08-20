import java.util.ArrayList;

public class Pizza {
    ArrayList toppings;
    public final void addTopping(String topping){
        toppings.add(topping);
    }
    public void removeTopping(String topping){
        toppings.remove(topping);
    }
}
class PepperoniPizza extends Pizza{
//    public void addTopping(String topping){
//        System.out.println("cannot add Toppings");
//    }
}