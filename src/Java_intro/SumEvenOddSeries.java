package Java_intro;

public class SumEvenOddSeries {
    public static void main(String[] args) {
        int max = 10;
        int sum = 0;

        for (int i=1; i<=max; i++) {
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        for (int i=1; i<=max; i++) {
            if(i%2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}


