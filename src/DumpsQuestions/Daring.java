package DumpsQuestions;

public class Daring {
    static  void jumper() throws Exception{
        try {
            throw new Exception();
        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try {
            jumper();
        }
        catch (Exception e){
            System.out.println("jump exc");
        }
    }
}
