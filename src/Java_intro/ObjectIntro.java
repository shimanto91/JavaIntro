package Java_intro;

/* Object is an entity having state and behavior.
   State: Data
   Behavior: Functionality, what it does
   An object: Car
   State: Name, Model, Color (Properties)
   Behavior: Functions of a car

   Object represents a class.
   Each class can be assigned with an object

   Properties of an object is said to be functions in Java

   >Creating an object:
         ClassName objectName = new ClassName();

   >Calling an object:
                      ObjectName.methodName();
 */

public class ObjectIntro {
    public static void main(String[] args) {
        sum(20,10);

        ObjectIntro myObj = new ObjectIntro();
        myObj.sub(20,10);
    }
    public static void sum2(int a, int b){
        int sum2 = a + b;
        System.out.println("Sum is: " + sum2);
    }
    private static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    private void sub(int a, int b){
        int sub = a - b;
        System.out.println("Sub is: " + sub);
    }
    public static void mult(int a, int b){
        int mult = a * b;
        System.out.println("Mult is: " + mult);
    }
}


/* Here, the methods sum and sub have been made private.

 >First keyword of a method is said to be access modifier:
   - public: The method can be used from any package and class
   - private: The method can be used from within only that class
   - protected: The method can be used in any class within same package

 >Second used keyword defines what is returned
   - static: The method can be called without calling any object.
             Can not be called using object.
   - without 'static' is non-static, needs object to call the method.

 >If 'ObjectName.' is entered, names of all possible methods that can be called by object within that class popped up
 */