package Dumps;

/*public class A {
    void process()throws Exception{
        throw new Exception();
    }
}
class Bb extends A{
    void process(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        new Bb().process();
    }
}*/

import java.io.IOException;

public class A {
    public void process()throws IOException{
        System.out.println("A");
    }
}
class Bb extends A{
    public void process()throws IOException{
        super.process();
        System.out.print("B");
        throw new IOException();
    }

    public static void main(String[] args) {
        try{
            new Bb().process();
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}
