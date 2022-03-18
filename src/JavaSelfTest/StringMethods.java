package JavaSelfTest;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "I am not there yet! ";
        String str2 = "One can not do that";

        Scanner sc = new Scanner(System.in);
        System.out.println("Input required position index:");
        int x = sc.nextInt();

        System.out.println(str1.charAt(x));
        System.out.println(str1.codePointAt(x));
        System.out.println(str1.codePointBefore(x));
        System.out.println(str1.codePointCount(4, 17));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.contains("there"));
        System.out.println(str2.contentEquals("can not"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.indexOf("t"));  //Returns first found occurence
        System.out.println(str1.lastIndexOf("t"));
        System.out.println(str2.isEmpty());
        System.out.println(str1.replace("t"," "));  //same for 'repalceAll()'
        System.out.println(str1.replaceFirst("t"," "));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.trim());
        System.out.println(str2.valueOf("5")); //??
    }
}
