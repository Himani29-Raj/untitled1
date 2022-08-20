package Dumps;

public class Test8 {
//    int sum = 0;
//    public void doCheck(int number){
//        if(number % 2 == 0){
//            break;
//        }
//    }
public static void main(String[] args) {
//    String color = "teal";
//    switch (color){
//        case "Red":
//            System.out.println("Found Red");
//        case "Blue":
//            System.out.println("Found Blue");
//            break;
//        case "Teal":
//            System.out.println("Found Teal");
//        default:
//            System.out.println("Found default");
//    }


    int num = 5;
    int sum = 0;

    do{
        sum += num;
    }while ((num--) > 1);
    System.out.println("The sum is" + sum + ".");
}
}
