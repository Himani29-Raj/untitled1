package Dumps;

import java.util.ArrayList;
import java.util.List;

public class Test0 {
    public static List data = new ArrayList();
    static  List update(String[]strs){
        for(String x : strs){
            data.add(x);
        }
        return data;
    }
    public static void main(String[] args) {
//        String[] d = {"a","b","c"};
//        update(d);
//        for(String s : d){
//            System.out.println(s + " ");
//        }
//        Integer num = Integer/parseInt(args[1]);
//        System.out.println("Number is : " + num);

//        int day = 1;
//        switch (day){
//            case 7:
//                System.out.println("Uranus");
//            case 6:
//                System.out.println("Saturn");
//            case 1:
//                System.out.println("Mercury");
//            case 2:
//                System.out.println("Venus");
//            case 3:
//                System.out.println("Earth");
//            case 4:
//                System.out.println("Mars");
//            case 5:
//                System.out.println("Jupiter");
  try{
      String[] arr = new String[4];
      arr[1] = "Unix";
      arr[2] = "Linux";
      arr[3]= "Solarios";
      for (String var : arr){
          System.out.print(var + " ");
      }
        }catch (Exception e){
      System.out.println(e.getClass());
  }
    }
}
