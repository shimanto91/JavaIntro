package JavaSelfTest;

import java.util.Scanner;

public class CubeSum {
    public static void main(String[] args) {

        int sumCu = 0;
        int sumCuEv = 0;
        int sumCuOd = 0;
        int sumCuEv2 = 0;
        int sumCuOd2 = 0;

        for (int i=1; i<=4; i++) {
            sumCu = sumCu + i*i*i;
        }
        System.out.print(sumCu);

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum: ");
        int max = sc.nextInt();

        for (int i = 1; i <= max; i++){
            if(i%2==0){
                sumCuEv = sumCuEv + i*i*i;
            }else{
                sumCuOd = sumCuOd + i*i*i;
            }
        }

        System.out.println("Sum of cubes of even numbers within " + max + " is " + sumCuEv);
        System.out.println("Sum of cubes of odd numbers within " + max + " is " + sumCuOd);

        System.out.println();

        int max2 = sumCu;
        System.out.println("Enter maximum: " + max2);

        for (int i = 1; i <= max2; i++){
            if(i%2==0){
                sumCuEv2 = sumCuEv2 + i*i*i;
            }else{
                sumCuOd2 = sumCuOd2 + i*i*i;
            }
        }

        System.out.println("Sum of cubes of even numbers within " + max2 + " is " + sumCuEv2);
        System.out.println("Sum of cubes of odd numbers within " + max2 + " is " + sumCuOd2);
    }
}
