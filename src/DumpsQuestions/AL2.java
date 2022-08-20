package DumpsQuestions;

import java.util.ArrayList;
import java.util.List;

public class AL2 {
    public static void main(String[] args) {
        List<Long>longs = new ArrayList<>();
        longs.add(new Long(1));
        longs.add(2L);
        longs.add(new Long("3"));
        System.out.println(longs.indexOf(new Long(3)));
    }
}
