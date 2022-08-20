package DumpsQuestions;

class Feline{
    String name;
    Feline(String n){
        name = " " + n + " ";
    }
    Feline(){

    }
}
public class Kitty extends Feline{
    String name =  "Kitty";
    Kitty(String n){
        name = n;
    }

    public static void main(String[] args) {
      Kitty k = new Kitty("Niki");
        System.out.println(k.name);
    }
}
