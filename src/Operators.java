interface Account{
public default String getId(){
        return "0000";
        }
        }
public class Operators {
    public static int operators(){
        int x1 = -4;
        int x2 = x1--;
        int x3 = ++x2;
        if(x2 > x3){
            --x3;
        }else{
            x1++;
        }
        return x1 + x2 + x3;
    }
    public static void main(String[] args) {


//        for :
//        for(int i = 0; i< 10; i++){
//            for (int j = 0; j< 10; j++){
//                if ( i+ j > 10 )  break for;
//            }
//            System.out.println( "hello");
//        }
//        String tom = args[0];
//        String dick = args[1];
//        String harry = args[2];
//        System.out.println(harry);
//        "hello".concat(" world").trim().equals("hello world");
//        "hello world".compareTo("Hello world") < 0
//        "Hello world".toLowerCase( ).equals("hello world");

//        System.out.println(operators());
//        int i = 4;
//        int ia[][][] = new int[i][i = 3][i];
//        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
    }
}
