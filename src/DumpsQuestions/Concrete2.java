package DumpsQuestions;

interface Face1{
    int m1(int a1);
}
interface Face2{
    int m2(int a2);
}
//public class Concrete2 implements Face1{
  //  public int m1(int y){
  //      return 7;
//    }
//}

//public class Concrete2 implements Face2{
//    public int m2(int l){
//        return 7;
//    }
//}
// class Concrete2 implements Face2{
//    public int m1(int r){
//        return 7;
//    }
//}
abstract class Concrete2 implements Face2,Face1{
    public int m4(){
        return 7;
    }
}
