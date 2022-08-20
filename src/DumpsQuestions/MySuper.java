package DumpsQuestions;

public class MySuper {
    public MySuper(int i){
        System.out.println(" super " + i);
    }
}
 class MySub extends MySuper{
    public MySub(){
        super(2);
        System.out.print(" sub");
    }

     public static void main(String[] args) {
         MySuper sup = new MySub();
     }
}
