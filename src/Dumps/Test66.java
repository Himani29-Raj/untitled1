package Dumps;

public class Test66 {
    public static void main(String[] args) {
//        int ax = 10,az = 30;
//        int aw = 1,ay = 1;
//        try{
//            aw = ax % 2;
//            ay = az / aw;
//        }catch (ArithmeticException e1){
//            System.out.println("Invalid Divisor");
//        }catch (Exception e2){
//            aw = 1;
//            System.out.println("Divisor changed");
//        }
//        ay  = az / aw;
//        System.out.println("Succesful Division"+ ay);

        for(int ii=0;ii<3;ii++){
            int count = 0;
            for(int jj = 3; jj > 0; jj--){
                if(ii == jj){
                    ++count;
                    break;
                }
            }
            System.out.print(count);
            continue;
        }
    }
}
