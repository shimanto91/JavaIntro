package JavaSelfTest;

import java.util.Scanner;

public class EvenOddSqSum {
    public static void main(String[] args) {
        int max;
        int sumSqEven = 0;
        int sumSqOdd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum: ");
        max = sc.nextInt();

        for (int i=1; i<=max; i++) {
            if(i%2==0) {
                sumSqEven = sumSqEven + i*i;
            }
            else {
                sumSqOdd = sumSqOdd + i*i;
            }
        }

        System.out.println("Even number square series sum: " + sumSqEven);
        System.out.println("Odd number square series sum: " + sumSqOdd);
    }
}




