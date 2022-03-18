package Java_intro;

public class OOP_Input {
    public static void main(String[] args) {
        sum(20,10);
        sub(20,10);
    }
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }
}


// Variable name passed inside a method is called argument
//Value defined in the main is called parameter