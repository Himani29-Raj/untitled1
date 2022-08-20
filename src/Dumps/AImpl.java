package Dumps;
// interface AB{
//    public void doSomething(String thing);
//}
//public class AImpl implements AB{
//    public void doSomething(String msg){
//
//    }
//}
//class B1{
//    public AB doIt(){
//     return null;
//    }
//    public String execute(){
//      return null;
//    }
//}
//class C extends B1{
//    public AImpl doIt(){
//       return null;
//    }
//    public Object execute(){
//        return null;
//    }
//}
class Bn{
    public static void main(String[] args) {
        Object obj = new int[]{1,2,3};
        int[]someArray = (int[]) obj;
        for (int i : someArray) System.out.println(i + " ");
    }
}