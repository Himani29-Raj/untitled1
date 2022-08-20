package Dumps;
abstract  class A1{
    public abstract void m1();
    public void m2(){
        System.out.println("Green");
    }
}
abstract class A2 extends A1{
    public  abstract void m3();
    public void m1(){
        System.out.println("Cyan");
    }
    public void m2(){
        System.out.println("Blue");
    }
}
public class A3 extends A2{
    public void m1(){
        System.out.println("Yellow");
    }
    public void m2(){
        System.out.println("Pink");
    }
    public void m3(){
        System.out.println("Red");
    }

    public static void main(String[] args) {
//        A2 tp = new A3();
//        tp.m1();
//        tp.m2();
//        tp.m3();


        String[] colors = {"red","blue","green","yellow","maroon","cyan"};
        int count = 0;
        for(String c : colors){
            if(count >= 4){
                break;
            }
            else{

                continue;
            }
//            if (c.length() >= 4){
//                colors[count] = c.substring(0,3);
//            }
//            count++;
        }
        System.out.println(colors[count]);
    }
}
