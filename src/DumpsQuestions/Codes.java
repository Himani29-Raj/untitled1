package DumpsQuestions;

import java.util.ArrayList;

public class Codes {
    private String name = "";
    private ArrayList<String> codes = new ArrayList<>();
    String getName(){
        return name;
    }
    ArrayList<String> getCodes(){
        return codes;
    }
    void setName(String n){
        name = n;
    }
    void setCodes(ArrayList<String>c){
        codes.clear();
        for (String s : c)
            codes.add(s);
    }
}
class Share{
    public static void main(String[] args) {
        ArrayList<String>c = new ArrayList<>();
        c.add("c0");
        c.add("c1");
        c.add("c2");
        Codes myCodes = new Codes();
        myCodes.setCodes(c);
        ArrayList<String> c2 = new ArrayList<>();
        c2 = myCodes.getCodes();
        System.out.println(c2);
    }
}
