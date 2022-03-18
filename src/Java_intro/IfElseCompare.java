package Java_intro;

import java.util.Scanner;

public class IfElseCompare{
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        if(number >= 10) {
            System.out.println("OK");
        }else {
            System.out.println("INVALID");
        }
    }
}
