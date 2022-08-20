package Dumps;

public class nulll {
    public static void main(String[] args) {
        try{
            System.out.println((char[]) null);
        }catch (NullPointerException e1){
            System.out.println("a");
        }catch (Exception e2){
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
    }
}
