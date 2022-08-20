import lamentation.Lamentable;
public class Lame implements Lamentable {
   public void lament(){
        System.out.println("Man,this class is lane.");
    }
    void lament(int n){
        System.out.println("How lame is this class? Let me count the ways: " + n);
    }
//    int lament(){
//        System.out.println("Really, really lame.");
//    }
//    private void lament(){
//        System.out.println("Seriously, why would you ever use this class?");
//    }
}
