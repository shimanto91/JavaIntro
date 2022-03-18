package Java_intro;

public class SumSeries {
  public static void main(String[] args) {
      int max = 20;
      int sum = 0;

      for (int i= 1; i<=max; i++) {
          sum = sum + i;
      }
      System.out.println(sum);
    }
}
