package Java_intro;

public class PrintEvenOddSeries {
    public static void main(String[] args) {
        int max = 10;

        System.out.println("Even Numbers:");
        for (int i= 1; i<=max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd Numbers:");
        for (int i= 1; i<=max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
