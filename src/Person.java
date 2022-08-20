public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    public boolean equals(Object o){
        if((o instanceof Person))return false;
        Person p = (Person) o;
        return p.name.equals(this.name);
    }

    public static void main(String[] args) {
        new Person("Himani").equals("Himani");
        new Person("HIMANI").equals("HIMANI");

    }
}
