public class Plant {
    private  String name;
    public Plant(){
        this("fern");
    }
    public  Plant(String name){
        this.name=name;
        System.out.println(name);
    }
    public String getName(){
        return name;
    }
}
class Tree extends  Plant{
    public  void  growFruit(){}
    public void dropLeaves(){}

    public static void main(String...args) {
        new Tree();
    }
}
