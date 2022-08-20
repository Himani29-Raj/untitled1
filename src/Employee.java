public class Employee {
    static void method(double i ){
        System.out.println(1);
    }
  //  static void method(int i){
    //    System.out.println(2);
  //  }
    static void method(float i){
        System.out.println(3);
    }

    public static void main(String[] args) {
        method((short)12);
    }
}
