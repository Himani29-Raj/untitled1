package DumpsQuestions;

interface Flyer{
    void printWingspan();
    void fly();
}
abstract class Bird implements Flyer{
    public void fly(){}
    public void waddle(){}
}
public class Hawk extends Bird {
    public void printWingspan(){}
}
