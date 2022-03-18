package Java_intro;

public class OOP {
    public static void main(String[] args) {
           sum();
           sub();
           mult();
           div();
    }
    public static void sum(){
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    public static void sub(){
        int a = 10;
        int b = 5;
        int sub = a - b;
        System.out.println("Sub is: " + sub);
    }
    public static void mult(){
        int a = 10;
        int b = 5;
        int mult = a * b;
        System.out.println("Mult is: " + mult);
    }
    public static void div(){
        int a = 10;
        int b = 5;
        int div = a / b;
        System.out.println("Division is: " + div);
    }
}


/* Rule to create a method:

     public static void methodName(){
        codes go here......
     }

   Methods can be reused in another class
 */