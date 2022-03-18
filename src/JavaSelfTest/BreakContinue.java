package JavaSelfTest;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Continue: ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Break in While Loop: ");
        int i = 0;
        while (i<10) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("Continue in While Loop: ");
        while (i<10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

