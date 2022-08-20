package DumpsQuestions;

public class SuitCase {
    private int id;
    public SuitCase(int id){
        this.id=id;
    }
    public boolean equals(Object obj){
        SuitCase other = (SuitCase) obj;
        return id == other.id;
    }

    public static void main(String[] args) {
        SuitCase a = new SuitCase(1);
        SuitCase b = new SuitCase(1);
        SuitCase c = b;
        String result = "_";
        if(a == b) result += "1";
        if(b == c) result += "2";
        b=c;
        if(a.equals(b)) result += "3";
        if(b.equals(a)) result += "4";
        System.out.println(result);
    }
}
