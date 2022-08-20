package Dumps;

import org.apache.groovy.json.internal.IO;

import java.io.IOException;

public class Y {
    public static void main(String[] args)throws IOException {
        try{
doSomething();
        }catch (IOException e){
            System.out.println(e);
        }
    }
    static void doSomething()throws IOException{
        if(Math.random() > 0.5) throw new IOException();
        throw new RuntimeException();
    }
}
