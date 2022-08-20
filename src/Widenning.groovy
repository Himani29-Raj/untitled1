class Widenning {
    public static void printSum(int a, int b){
        System.out.println("In int "+(a+b));
    }

    public static void printSum(Integer a, Integer b){
        System.out.println("In Integer "+(a+b));
    }

    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));
    }

    public static void main(String[] args) {
        "hello".concat(" world").trim().equals("hello world")
        "hello world".compareTo("Hello world") < 0
        "Hello world".toLowerCase( ).equals("hello world")

        printSum(1, 2);
    }
}
