package DumpsQuestions;

import java.util.ArrayList;

public class Dart {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Fred");
        names.add("Ann");
        names.add("Jim");
        names.remove(new String("Fred"));
        names.add(1,"David");
        names.add("Ann");
        names.remove("Ann");
        System.out.println(names);
    }
}
