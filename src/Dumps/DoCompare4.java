package Dumps;

public class DoCompare4 {
//   static void m1(int i , String n, double d){
//        System.out.println(i + " " + n + " " + d);
//    }
    public static void main(String[] args) {
//        String[] table = {"aa","bb","cc"};
//        int ii = 0;
//        do
//            while(ii < table.length)
//                System.out.println(ii++);
//        while (ii < table.length);

//        m1(22,"Himani",9.0);

//        int [] array = {1,2,3,4,5};
//        System.arraycopy(array,2,array,1,2);
//        System.out.println(array[1]);
//        System.out.println(array[4]);

        int value = 33;
        if(value >= 0){
            if(value != 0)
                System.out.println("the");
            else
                System.out.println("quick");
            if (value < 10)
                System.out.println("brown");
            if (value > 30)
                System.out.println("fox");
            else if (value < 50)
                System.out.println("jumps");
            else if (value < 10)
                System.out.println("over");
            else
                System.out.println("the");
            if(value > 10)
                System.out.println("lazy");
        }else {
            System.out.println("dog");
        }
        System.out.println("...");
    }
}
