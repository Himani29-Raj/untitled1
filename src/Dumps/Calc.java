package Dumps;
class Mid{
    public int findMid(int n1,int n2){
        return (n1+n2)/2;
    }
}
public class Calc extends Mid{
    public static void main(String[] args) {
        int n1 = 22 , n2 = 2;
        Mid m1 = new Calc();
        int n3 = m1.findMid(n1,n2);
        System.out.println(n3);
    }
}
