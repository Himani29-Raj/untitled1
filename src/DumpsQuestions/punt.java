package DumpsQuestions;

public class punt {
    public static void main(String[] args) {
        punt p = new punt();
        Object o = p.go(new punt());
        punt[] p2 = (punt[])o;
        System.out.println(p.equals(p2[0]) + " " + (p == p2[0]));
    }
    punt[] go(punt p){
        punt[] p2 = {p};
        return p2;
    }
}
