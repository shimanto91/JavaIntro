package Java_intro;

//nextLong();  nextShort();  nextFloat();  nextLine();

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }
}



