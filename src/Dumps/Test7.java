package Dumps;

public class Test7 {
    static void dispResult(int[] num){
        try{
            System.out.println(num[1] / num[1] - num[2]);
        }catch (ArithmeticException e){
            System.out.println("first exception");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        try {
            int[] arr={100,100};
            dispResult(arr);
        }catch (IllegalArgumentException e){
            System.out.println("Second exception");
        }catch (Exception e){
            System.out.println("third exception");
        }
    }
}
