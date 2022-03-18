package JavaSelfTest;

import java.util.Scanner;

public class SqMultSeries {
    public static void main(String[] args) {
        int max;
        int mult = 1;
        int multEven = 1;
        int multOdd = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max value: ");
        max = sc.nextInt();

        for (int i = 1; i <= max; i++) {
            int x = i*i;
            mult = mult * x;

            if (i%2==0){
                multEven = multEven * x;
            } else {
                multOdd = multOdd * x;
            }
        }
        System.out.println(mult);
        System.out.println(multEven);
        System.out.println(multOdd);
    }
}
