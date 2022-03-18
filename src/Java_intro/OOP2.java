package Java_intro;

import static Java_intro.OOP.sum; //One way to import
import static Java_intro.OOP.sub;

public class OOP2 {
    public static void main(String[] args) {
           sum();
           sub();
           OOP.mult();  //Another way to call
           OOP.div();
    }

}


/* Rule to create a method:

     public static void methodName(){
        codes go here......
     }

   Methods can be reused in another class
 */