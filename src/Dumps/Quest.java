package Dumps;

import java.lang.reflect.Array;
import java.util.*;

public class Quest {
    void waitForSignal()throws InterruptedException{
        Object obj = new Object();
        synchronized (Thread.currentThread()){
            obj.wait();
            obj.notify();
        }
    }
    public static void main(String[] args) {
try {
    new Quest().waitForSignal();
}catch (Exception e){
    System.out.println("caught InterruptedException");
}

//        String[] colors = {"blue","red","green","yellow","orange"};
//        Arrays.sort(colors);
//        int s2 = Arrays.binarySearch(colors,"orange");
//        int s3 = Arrays.binarySearch(colors,"violet");
//        System.out.println(s2 + "" + s3);

//        HashMap props = new HashMap();
//        props.put("Key45" , "some value");
//        props.put("Key12" , "some other value");
//        props.put("key39" , "yet another value");
//        Set s = props.keySet();
//        s = new TreeSet(s);
//        System.out.println(s);
    }
}
