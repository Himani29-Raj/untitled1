package DumpsQuestions;

import java.util.ArrayList;

public class Sorter {
    public static void main(String[] args) {
        ArrayList<String>sa = new ArrayList<String>();
        sa.add("a");
        sa.add("b");
        sa.add("c");
        String sb[] = new String[3];
        for(int x = 1;x< sa.size();x++)
            sb[x] = sa.get(x);
        for (String s : sb)
            System.out.print(s + " ");
    }
}
