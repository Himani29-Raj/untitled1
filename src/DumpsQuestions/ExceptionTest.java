//package DumpsQuestions;
//
//    class MyException extends Throwable{}
//    class MyException1 extends MyException{}
//    class MyException2 extends MyException{}
//    class MyException3 extends MyException2{}
//    public class ExceptionTest{
//        public ExceptionTest(String s1, String s2) { }; //5
//        void myMethod() throws MyException{
//            throw new MyException3();
//public int transformNumber(int n){
//    int radix = 2;
//    int output = 0;
//    output += radix*n;
//    radix = output/radix;
//    if(output<14){
//        return output;
//    }
//    else{
//        output = output*radix/2;
//        return output;
//    }
//   else {
//        return output/2;
//    }
//}
//void crazyLoop(){
//    int c = 0;
//    JACK: while (c < 8){
//        JILL: System.out.println(c);
//        if (c > 3) break JILL; else c++;
//    }
//}
//        public static void main(String[] args) {
//            int index = 1;
//            String[] strArr = new String[5];
//            String   myStr  = strArr[index];
//            System.out.println(myStr);
//            long g = 012;
//            short s = 12;
//            float f = -123;
//            ExceptionTest et = new ExceptionTest();
//            try{
//                et.myMethod();
//            }
//            catch(MyException me){
//                System.out.println("MyException thrown");
//            }
//            catch(MyException3 me3){
//                System.out.println("MyException3 thrown");
//            }
//            finally{
//                System.out.println(" Done");
//            }
//            int x = 10;
//            do{
//                x--;
//                System.out.println(x);  // 1
//            }while(x<10);

//            int k = 2;
//            while (--k) {
//                System.out.println(k);
//            }
//        }}
//