package DumpsQuestions;

public class Vet{
    public static void main(String[] args) {
      Dogs d = new Dogs();
      d.size = 4;
      Cats c = new Cats();
      c.grouchiness = 10;
        System.out.println(d + " " + c);
    }
}
class Dogs{
    int size;
}
class Cats{
    int grouchiness;
}
