package Java_intro;

import java.util.Scanner;

public class MethodWork1 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println(name.toUpperCase());
    }
}
