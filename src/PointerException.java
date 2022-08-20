public class PointerException {
    public static void main(String[] args) {
     /*   try{
            args=null;
            args[0]="test";
            System.out.println(args[0]);
        }catch (Exception e){
            System.out.println("Exception");
        }/*catch (NullPointerException np){
            System.out.println("NullPointerException");
        }*/


        int i ;
        for (i = 0; i <= 10; i++) {
            if (i > 6) break;
        }
        System.out.println(i);
    }


}
