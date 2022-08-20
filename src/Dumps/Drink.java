package Dumps;

import java.util.TreeSet;

/*public class Drink implements Comparable{
    public String name;
    public int compareTo(Object o){
        return 0;
    }

    public static void main(String[] args) {
        Drink one = new Drink();
        Drink two = new Drink();
        one.name="Coffee";
        two.name="Tea";
        TreeSet set = new TreeSet();
        set.add(one);
        set.add(two);
//        for (d[] : set)
//            System.out.println(d);
    }
}*/

class MinMax<E extends Comparable<E>>{
    E min = null;
    E max = null;
    public MinMax(){}
    public void put(E value){}

}

/*class MinMax<E extends Comparable<E>>{
    <E> E min = null;
    <E> E max = null;
    public MinMax(){}
    public void put(E value){}
}*/
