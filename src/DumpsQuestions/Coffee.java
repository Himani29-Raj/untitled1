package DumpsQuestions;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    String name = "";
    Coffee(){
        this("black");
    }
    Coffee(String n){
        name = n;
    }
    Coffee(String n,String add){
       // this(name);
        name = n + " " + add;
    }

    public static void main(String[] args) {
        List<Coffee> order = new ArrayList<>();
        order.add(new Coffee());
        order.add(new Coffee("mocha"));
        order.add(new Coffee("latte"));
        order.add(new Coffee("soy","sprinkles"));
        System.out.println(order);
    }
    public String toString(){
        return name;
    }
}
