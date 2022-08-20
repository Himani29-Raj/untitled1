package DumpsQuestions;

import java.util.ArrayList;

public class Cat {
    static int count = 0;
    Cat(){
        count++;
    }

    public static void main(String[] args) {
        ArrayList[] xa = {new ArrayList<Cat>(),new ArrayList<Cat>()};
        for (ArrayList al : xa)
            for (int x = 0; x < 4;x++)
                //al.add(new Cat());
                
                System.out.println(xa.length + " " + count + " ");
    }
}
