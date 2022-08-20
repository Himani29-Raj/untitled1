package DumpsQuestions;

public class Looping {
    public static void main(String[] args) {
        int i = 5,j = 3;
        do {
            System.out.print(i + " " + j + " ");
        }while (i++ == 5 || ++j ==3);
    }
}
