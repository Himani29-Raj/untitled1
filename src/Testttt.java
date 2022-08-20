public class Testttt {
    public enum Dogs{collie,harrier,shepherd};

    public static void main(String[] args) {
        Dogs myDog = Dogs.shepherd;
        switch (myDog){
            case collie :
                System.out.println("collie");
        }
    }
}
