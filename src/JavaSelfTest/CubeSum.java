package JavaSelfTest;

public class CubeSum {
    public static void main(String[] args) {

        int sum = 0;

        for (int i=1; i<=4; i++) {
            sum = sum + i*i*i;
        }
        System.out.print(sum);
    }
}
