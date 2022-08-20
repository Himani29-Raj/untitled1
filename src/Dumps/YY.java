package Dumps;

class XX{
    XX(){}
    protected void one(){}
}

public class YY extends XX {
    YY(){ }
    private void two(){ one();}

    public static void main(String[] args) {
        new YY().two();
    }
}
