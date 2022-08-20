package Dumps;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PRACTISE {
//    public static Iterator reverse(List list){
//        Collection.reverse(list);
//        return list.iterator();
//    }
    public static void main(String[] args) {
        String test = "TestA.TestB.TestC";
        String regex = "\\.\\s*";
        String[]result=test.split(regex);
        System.out.println(result);



//        Integer i = new Integer(1) + new Integer(2);
//        switch (i){
//            case 3:
//                System.out.println("three");break;
//            default:
//                System.out.println("other");break;
//        }
//        List list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        for(Object obj : reverse(list))
//            System.out.println(obj + ",");
    }
}
