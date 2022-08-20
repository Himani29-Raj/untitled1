public class Animal {
    public void eat(){
        System.out.println("Generic Animal Eating Generically");
    }
}
class Horse extends Animal{
    public void eat(){
        System.out.println("Horse eat hay!!");
    }
    public void eat(String s){
        System.out.println("Horse eating " + s);
    }
}
class Demo{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.eat("grass");
        Animal a = new Horse();
        a.eat();
    }
}