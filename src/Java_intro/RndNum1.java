package Java_intro;

import java.util.Random;

public class RndNum1 {
    public static void main(String[] args) {
        int i;
        Random rnum = new Random();

        for(i=1; i<=4; i++){
            System.out.println(rnum.nextInt(20));
        }

        System.out.println("Math.random() Method:");
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
