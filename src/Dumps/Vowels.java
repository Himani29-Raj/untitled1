package Dumps;

public class Vowels {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
         Vowels obj1 = new Vowels();
         Vowels obj2 = obj1;
         obj1.var = 'i';
         obj2.var = 'o';

        System.out.println(var1 + "," + var2);
        System.out.println(obj1.var + "," + obj2.var);
    }
}
