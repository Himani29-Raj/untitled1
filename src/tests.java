public class tests {
void m1(int x){
    System.out.println("int");
}
void m1(int...x){
    System.out.println("vars");
}

    public static void main(String[] args) {
        tests t = new tests();
        t.m1(2);

    }
}
