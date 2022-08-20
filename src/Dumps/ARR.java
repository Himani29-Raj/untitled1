package Dumps;

import xcom.B;

import java.util.ArrayList;
import java.util.List;

class Alphas{
    public String doStuff(String msg){
        return msg;
    }
}
class Beta extends Alphas{
    public String doStuff(String msg){
        return msg.replace('a','e');
    }
}
class Gama extends Beta{
    public String doStuff(String msg){
        return msg.substring(2);
    }
}
public class ARR {
    public static void main(String[] args) {
        List<Alphas>strs = new ArrayList<>();
        strs.add(new Alphas());
        strs.add(new Beta());
        strs.add(new Gama());
        for(Alphas t:strs)
            System.out.println(t.doStuff("Java"));
    }
}
