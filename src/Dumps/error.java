package Dumps;

public class error {
    static void test()throws Error{
        if(true)throw new AssertionError();
        System.out.println("test");
    }

    public static void main(String[] args) {
        try {
            test();
        }catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
