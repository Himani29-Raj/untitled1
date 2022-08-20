import java.util.*;

public class TreeSet {
    enum Example{ONE,TWO,THREE}

    public static void main(String[] args) {
     /*   Collection coll  = new ArrayList();
        coll.add(Example.THREE);
        coll.add(Example.THREE);
        coll.add(Example.THREE);
        coll.add(Example.TWO);
        coll.add(Example.TWO);
        coll.add(Example.ONE);
        Set set = new HashSet(coll);
        System.out.print(set);  */

        ArrayList<String> strings=new ArrayList<String>();
        strings.add("aAaA");
        strings.add("AaA");
        strings.add("aAa");
        strings.add("AAaa");
        Collections.sort(strings);
        for (String s : strings){
            System.out.print(s + " ");
        }
    }
}
