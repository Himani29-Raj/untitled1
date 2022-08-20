package Dumps;

abstract  class Employee{
    protected abstract double getSalesAmount();
    public double getCommision(){
        return getSalesAmount()*0.15;
    }
}
public class Sales extends Employee{
    @Override
//    protected double getSalesAmount() {
//        return 1230.45;
//    }
//    double getSalesamount(){
//        return 1230.45;
//    }

    public double getSalesAmount(){
        return 1230.45;
    }

    public static void main(String[] args) {

    }
}
