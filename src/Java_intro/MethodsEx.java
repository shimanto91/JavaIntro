package Java_intro;

public class MethodsEx {
    public static void main(String[] args) {
        String name1 = "Cinatra";
        String name2 = "John";
        String name3 = "CINATRA";
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(Math.max(11,12));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equalsIgnoreCase(name3));
        System.out.println(name1.replace("nat","Zinthai"));
        System.out.println(name1.replace("Cinatra","Zinthai"));
    }
}
