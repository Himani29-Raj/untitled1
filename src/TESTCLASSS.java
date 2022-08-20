public class TESTCLASSS {
    public void switchTest(byte x){
        switch(x){
            case 'b':   // 1
            default :   // 2
            case -2:    // 3
            case 80:    // 4
        }
    }
    public void doA(int k) throws Exception {  // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }
    public void doB(boolean f)throws Exception { // 2
        if(f) {
            doA(15); // 3
        }
        else return;
    }
    public static void main(String[] args) { // 4
//        TESTCLASSS t = new TESTCLASSS();
//        t.doB(args.length>0); // 5

//        boolean b = false;
//        int i = 1;
//        do{
//            i++ ;
//        } while (b = !b);
//        System.out.println( i );
        System.out.println("12345".charAt(6));
    }
}
//    public static double getSwitch(String str){
//        return Double.parseDouble(str.substring(1, str.length()-1) );
//    }
//    public static void main(String args []){
//        switch(getSwitch(args[0])){
//            case 0.0 : System.out.println("Hello");
//            case 1.0 : System.out.println("World"); break;
//            default : System.out.println("Good Bye");
//        }
//    }
//public int luckyNumber(int seed){
//    if(seed > 10) return seed%10;
//    int x = 0;
//    try{
//        if(seed%2 == 0) throw new Exception("No Even no.");
//        else return x;
//    }
//    catch(Exception e){
//        return 3;
//    }
//    finally{
//        return 7;
//    }
//}
//
//    public static void main(String args[]){
//        int amount = 100, seed = 6;
//        switch( new TESTCLASSS().luckyNumber(6) ){
//            case 3: amount = amount * 2;
//            case 7: amount = amount * 2;
//            case 6: amount = amount + amount;
//            default :
//        }
//        System.out.println(amount);
//    }
//}
//interface