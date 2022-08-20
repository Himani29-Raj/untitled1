package TypeCasting;

public class Base1 {}
class Base2{}
class Der1 extends Base1{}
class Der2 extends Base1{}
class Der3 extends Base2{}
class Der4 extends Base2{}

class Demo{
    public static void main(String[] args) {
       /* Base2 b = new Der4();
        Object o = (Base1)b;*/

        Base2 b = new Der4();
        Object o = (Base2)b;

        Base2 bb= new Der4();
        Object oo = (Der3)bb;

       /* Base2 b2 = new Der4();
        Base2 b3 = (Base1)b2;*/

        Base2 b4 = new Der4();
        Base2 b5 = (Der4) b4;
    }
}
