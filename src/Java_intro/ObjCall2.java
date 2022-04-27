package Java_intro;

/*Inheritance
   - Effective for different packages
   - 'extends' keyword
   - Multiple inheritance is not possible
 */

public class ObjCall2 extends ObjectIntro{
    public static void main(String[] args) {
        sum2(30,10);
        mult(30,10);

        ObjCall2 myObj3 = new ObjCall2();
        myObj3.div(40,60);
    }
}

//Methods are of two kinds: i)User Defined;  ii) Built-in/Predefined
//Methods can be called within another method, not only 'main', any place, anywhere
