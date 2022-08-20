package DumpsQuestions;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    public static void main(String[] args) {
        List<String> myPets = new ArrayList<>();
        myPets.add("Bokeh");
        myPets.add("Boi");
        myPets.add("Niki");
        if(myPets.contains("Bokeh"))
            myPets.add("Kara");
        myPets.add("Eyra");
        if(myPets.contains("Eyra"))
            myPets.add("Kara");
//        if (myPets.contains("bokeh"))
//            myPets.add("Kara");
//        System.out.println(myPets.size());
        System.out.println(myPets);
    }
}
