package DumpsQuestions;

class AA{
    public void say(){
        System.out.println("Hey! ");
    }
}
class B extends AA{
    public void say(String name){
        System.out.println("Hello, " + name);
    }
}
class C extends AA{
}


public class Start {
    public static void main(String[] args) {
      /*  B b = new B();
        b.say();
        b.say("John Lennon");*/
    }
}
