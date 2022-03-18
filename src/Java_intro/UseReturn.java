package Java_intro;

public class UseReturn {
    public static void main(String[] args) {
            UseReturn objz = new UseReturn();
            int res = objz.sum();
            System.out.println(res);
    }
    public int sum(){
        int a = 10;
        int b = 5;
        int sum = a+b;
        return sum;
    }
    public static void add(int x, int y){
        int add = x+y;
        System.out.println("Addition is: " + add);
    }
}

//Here, sum can be used in other places without defining printing