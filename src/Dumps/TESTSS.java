package Dumps;

public class TESTSS {
    public static void main(String[] args) {
        String test = "This is a test";
        String[]tokens=test.split("\s");
        System.out.println(tokens.length);
        System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " " + tokens[3]);
    }
}
