package JavaSelfTest;

import java.util.Scanner;

public class RootSeriesSum {
    public static void main(String[] args) {
        double sum = 0;
        double mult = 1;
        int max;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum value: ");
        max = sc.nextInt();

        for (int i=0; i<=max; i++) {
            sum = sum + Math.sqrt(i);
        }

        for (int i=1; i<=max; i++) {
            mult = mult * Math.sqrt(i);
        }
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(Math.cbrt(27));
    }
}
