package DumpsQuestions;

public class Parity {
    String name;
    Parity(String n){
        name = n;
    }

    public static void main(String[] args) {
        String s = "text";
        Parity p = new Parity("text");
        StringBuilder sb = new StringBuilder("text");
        if (s.equals(p))
            System.out.println("1");
        if(s.equals(sb))
            System.out.println("2");
        if (sb.equals(p))
            System.out.println("3");
        if (sb.equals("text"))
            System.out.println("4");
        if (s.equals("text"))
            System.out.println("5");
    }
}
