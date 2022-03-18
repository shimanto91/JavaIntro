package JavaSelfTest;

import java.util.Scanner;

public class UserInputCube {
    public static void main(String[] args) {
        int max;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max value: ");
        max = sc.nextInt();

        for (int i=1; i<=max; i++) {
            sum = sum + i*i*i;
        }

        System.out.println(sum);
    }
}