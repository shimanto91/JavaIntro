package JavaSelfTest;

import java.util.Scanner;

public class EvenOddSqSum {
    public static void main(String[] args) {
        int max;
        int sumEven = 0;
        int sumOdd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum: ");
        max = sc.nextInt();

        for (int i=1; i<=max; i++) {
            if(i%2==0) {
                sumEven = sumEven + i*i;
            }
            else {
                sumOdd = sumOdd + i * i;
            }
        }
         System.out.println("Ëven number square series sum: " + sumEven);
         System.out.println("Odd number square series sum: " + sumOdd);
    }
}




