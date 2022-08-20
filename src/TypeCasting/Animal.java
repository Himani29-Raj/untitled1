package TypeCasting;

public class Animal {
    void makeNoise(){
        System.out.println("generic noise");
    }
}
class Dog extends Animal{
    void makeNoise(){
        System.out.println("bark");
    }
    void playDead(){
        System.out.println("roll Over");
    }
}
class DogTest{
    public static void main(String[] args) {
        Animal [] a = {new Animal(),new Dog(),new Animal()};
        for (Animal animal : a){
            animal.makeNoise();
            if(animal instanceof Dog){
                ((Dog) animal).playDead();

            }
        }
    }
}
