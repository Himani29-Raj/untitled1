package DumpsQuestions;

public class Foo {
    protected short test(float [] y){
        return 3;
    }
}
class AAA extends Foo{
//    public test(float [] y){  compilation error
//        return7;
//    }

  public int test(float x){
           return 7;
   }

//    public long test(float [] y){  compilation error
//        return 7;
//    }

//    short test(float [] x){ compilation error
//        return 7;
//    }

//    private short test(float x){
//        return 7;
//    }

//    protected short test(float x ){
//        return 7;
//    }
}
