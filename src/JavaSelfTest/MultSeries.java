package JavaSelfTest;

import java.util.Scanner;

public class MultSeries {
    public static void main(String[] args) {
        int max;
        int mult = 1;
        int multEven = 1;
        int multOdd = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max value: ");
        max = sc.nextInt();

        for (int i = 1; i <= max; i++) {
            mult = mult * i;

            if (i%2==0){
                multEven = multEven * i;
            } else {
                multOdd = multOdd * i;
            }
        }
        System.out.println(mult);
        System.out.println(multEven);
        System.out.println(multOdd);
    }
}
