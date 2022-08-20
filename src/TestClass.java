/*public class Payload {
    synchronized Payload p;
    private int weight;
    public Payload(int w){
        weight = w;
    }
    public  void setWeight(int w){
        weight = w;
    }
    public String toString(){
        return Integer.toString(weight);
    }
}

class TestPayload{
  /*  static void changePayload(Payload p){
        p.setWeight(420);
    }

    public static void main(String[] args) {
        Payload p = new Payload(200);
        p.setWeight(1024);
        changePayload(p);
        System.out.println("p is " + p);
    }*/


import DumpsQuestions.L;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//public class TestClass{
//    long l = new Long("123");

//    public static void main(String[] args) {
//        public class TestClass{
//            public static void main(String args[]){
//                Stack s1 = new Stack ();
//                Stack s2 = new Stack ();
//                processStacks (s1,s2);
//                System.out.println (s1 + "    "+ s2);
//            }
//            public static void processStacks(Stack x1, Stack x2){
//assume that the method push adds the passed object to the stack.
//                x1.push (new Integer ("100"));
//                x2 = x1;

//        String myStr = "good";
//        char[] myCharArr = {'g', 'o', 'o', 'd' };
//
//        String newStr = null;
//        for(char ch : myCharArr){
//            newStr = newStr + ch;
//            newStr.concat("acv");
//        }
//SecurityException
//        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
//            }
//        }//        int a = Integer.MIN_VALUE;
//        System.out.println(a);
//        int b = a;
//        System.out.println(b);
//        System.out.println( a+ "   "+b);
//        int i = 1234567890;
//        Boolean b;
//        float f = i;
//        System.out.println(i - (int)f);


//        String mStr = "123";
//        long m =Long.valueOf(mStr).longValue();
//        System.out.println(m);// 1
//        short s = Short.MAX_VALUE;
//        char c = (char) s;
//        System.out.println( c == Short.MAX_VALUE);
//        try{
//            System.exit(0);
//        }
//        finally{
//            System.out.println("finally is always executed!");
//        }
//        while(true){
//            additional valid code
//            if(isDone()) continue;
//        }
//    int i, j, k;
//    i = j = k = 9;
//      System.out.println(i);
//
//
//    private static boolean isDone() {
//        return true;
//    }
//}

//class ABCD{
//    int x = 10;
//    static int y = 20;
//}
//class MNOP extends ABCD{
//    int x = 30;
//    static int y = 40;
//}
//
//public class TestClass {
//    public static void main(String[] args) throws Exception {
//        System.out.println(new MNOP().x+", "+new MNOP().y);
//        try{
//            m1();
//            System.out.println("A");
//        }
//        finally{
//            System.out.println("B");
//        }
//        System.out.println("C");
//    }
//    public static void m1() throws Exception { throw new Exception(); }
//}
//abstract class Calculator{
//    abstract void calculate();
//    public static void main(String[] args){
//        System.out.println("calculating");
//        Calculator x = null;
//        x.calculate();
//    }
//}
//class StringWrapper {
//    private String theVal;
//    String a = "sdgfhh";
//
//    public StringWrapper(String str){ this.theVal = str; }
//}
//class Testers{
//    public static void main(String[] args) {
//        Runnable r  = new Thread();
//        String s = "ghjkk";
//        System.out.println(s.length());
//        System.out.println();
//        StringWrapper sw = new StringWrapper("How are you?");
//        StringBuilder sb = new StringBuilder("How are you?");
//        System.out.println("Hello, "+sw);
//        System.out.println("Hello, "+sb);
//        List s1 = new ArrayList();
//        s1.add("a");
//        s1.add("b");
//        s1.add(1,"c");
//        List s2 = new ArrayList(s1.subList(1,1));
//        s1.addAll(s2);
//        System.out.println(s1);

//        int i = 0 ;
//        boolean bool1 = true ;
//        boolean bool2 = false;
//        boolean bool  = false;
//        bool = ( bool2 &  method1(i++) ); //1
//        bool = ( bool2 && method1(i++) ); //2
//        bool = ( bool1 |  method1(i++) ); //3
//        bool = ( bool1 || method1(i++) ); //4
//        System.out.println(i);
//    }
//    public static boolean method1(int i){
//        return i>0 ? true : false;
//    }
//}
// interface ConstTest{
//    public int A = 1; //1
//    int B = 1;          //2
//    static int C = 1;  //3
//    final int D = 1; 	 //4
//    public static int E = 1; //5
//    public final int F = 1;  //6
//    static final int G = 1;    //7
//    public static final int H = 1; //8
//}
//class Base{
//    public Object getValue(){ return 1; } //1
//}
//class Base2 extends Base{
//    public Integer getValue(){ return 2; } //2
//}
//public class TestClass {
//    static TestClass ref;
//    String[] arguments;
//
//    public static void main(String args[]) {
//        ref = new TestClass();
//        ref.func(args);
//    }
//
//    public void func(String[] args) {
//        ref.arguments = args;
//    }
//}
//    public static int[ ] getArray() {  return null;  }
//    public static void main(String[] args){
//        int index = 1;
//        try{
//            getArray()[index=2]++;
//        }
//        catch (Exception e){  }  //empty catch
//        System.out.println("index = " + index);
//    }


//    public static int getSwitch(String str){
//        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
//    }
//    public static void main(String args []){
//        switch(getSwitch(args[0])){
//            case 0 : System.out.print("Hello ");
//            case 1 : System.out.print("World"); break;
//            default : System.out.print("Good Bye");

//        String str1 = "one";
//        String str2 = "one";
//        System.out.println( str1.equals(str1=str2) );

//        String myStr = "good";
//        char[] myCharArr = {'g', 'o', 'o', 'd' };
//
//        String newStr = null;
//        for(char ch : myCharArr){
//            newStr = newStr + ch;
//        }
//
//        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

//                Data d1 = new Data(10);
//                d1.strVal = "D1";
//                Data d2 = d1;
//                d2.intVal = 20;
//                System.out.println("d2 val = "+d2.strVal);


//        int i = 0;
//        loop :         // 1
//        {
//            System.out.println("Loop Lable line");
//            try{
//                for (  ;  true ;  i++ ){
//                    if( i >5) break loop;       // 2
//                }
//            }
//            catch(Exception e){
//                System.out.println("Exception in loop.");
//            }
//            finally{
//                System.out.println("In Finally");      // 3
//            }
//        }
//            }
//        }
//
//
//class Data {
//
//    int intVal = 0;
//    String strVal = "default";
//    public Data(int k){
//        this.intVal = k;
//    }
//
//}
//

//}
//    public static void main(String[] args){
//        Base b = new Base2();
//        System.out.println(b.getValue()); //3
//    }
//class PortConnector {
//
//    public PortConnector(int port) throws IOException{
//        if (Math.random() > 0.5) {
//            throw new IOException();
//        }
//
//        throw new IOException();
//    }
//}
//
//
//public class TestClass {
//
//    public static void main(String[] args)throws IOException {
//        try {
//            PortConnector pc = new PortConnector(10);
//        } catch (IOException re) {
//            re.printStackTrace();
//        }
//    }
//}