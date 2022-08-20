package DumpsQuestions;

public class Plant {
    String getName(){
        return "plant";
    }
    Plant getType(){
        return this;
    }
}
class Flower extends Plant{
   /* Flower getType(){
        return this;
    }*/

    /*String getType(){   Compilation fails : Incompatible type
        return "this";
    }*/

    /*Plant getType(){
        return this;
    }*/

    Tulip getType(){
        return new Tulip();
    }
}
class Tulip extends Flower{

}
