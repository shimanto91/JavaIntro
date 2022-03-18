package Java_intro;

import java.util.Scanner;

public class SqrSqrRoot {
    public static void main(String[] args) {
        double num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        num = sc.nextDouble();
        System.out.println("Square is: " + num*num);
        System.out.println("Square root is: " + Math.sqrt(num));
    }
}
