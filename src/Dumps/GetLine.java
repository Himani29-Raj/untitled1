package Dumps;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class GetLine {
    public static int sum(List list){
        int sum = 0;
        for(Iterator iter = list.iterator();iter.hasNext();){
            int i = ((Integer)iter.next()).intValue();
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {


    }
}
