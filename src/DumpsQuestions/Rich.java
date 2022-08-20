package DumpsQuestions;

public class Rich {
    String name;

    Rich(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Rich r = new Rich("Tom");
        String s = "Hank";
        StringBuilder sb  = new StringBuilder( "Leo");
        System.out.println(r + " " + s + " " + sb);
        //sb.co
    }
}
