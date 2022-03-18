package Java_intro;

import java.util.Scanner;

public class IfElseInput {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}


