package JavaSelfTest;

import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {
        String[] cars = {"Toyota", "Suzuki", "Ford", "Opel", "Mazda"};
        int[] numbers = {2, 5, 9, 8, 7, 23};

        String[] [] myArray = {{"Pencil", "Eraser", "Book", "Pen"}, {"You", "Me", "Us"} };
        int[] [] numArray = {{2, 3, 7},{4, 1, 13}};

        String z1 = myArray[1][2];
        int z2 = numArray[1][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Required index: ");
        int x = sc.nextInt();

        System.out.println();

        System.out.println(cars[x]);
        System.out.println(cars[x] = "BMW");
        System.out.println(cars.length);

        System.out.println();

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println();

        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(myArray[0][1]);
        System.out.println(numArray[0][2]);

        System.out.println();

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j <= myArray.length; j++){
                System.out.println(myArray[i][j]);
            }
        }

        System.out.println();

        for (int i = 0; i < numArray.length; i++){
            for (int j = 0; j <= numArray.length; j++){
                System.out.println(numArray[i][j]);
            }
        }
   }
}