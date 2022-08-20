public class Discounter {
    //        static double percent; //1
//        int offset = 10, base= 50; //2
//        public static double calc(double value) {
//            int coupon, offset, base; //3
//            if(percent <10){ //4
//                coupon = 15;
//                offset = 20;
//                base = 10;
//            }
//            return coupon*offset*base*value/100; //5
//        }static TestClass ref;
//   String[] arguments;
//   public static void main(String args[]){
//      ref = new TestClass();
//      ref.func(args);
//   }
//   public void func(String[] args){
//      ref.arguments = args;
//  }
//        public static void main(String[] args) {
//            Exception e = null;
//            throw  e;
//            System.out.println(null + true); //1
//            System.out.println(true + null); //2
//            System.out.println(null + null); //3
//            for (int i = 0; i < args.length; i++) {
//                System.out.print("  " + args[i]);
//            System.out.println(calc(100));
//            }
//        }
//}
    public static void main(String[] args) {

        boolean hasParams = (args == null ? false : true);
        if (hasParams) {
            System.out.println("has params");
        }
        {
            System.out.println("no params");
        }
    }
}
