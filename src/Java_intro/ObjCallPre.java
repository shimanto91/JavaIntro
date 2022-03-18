package Java_intro;

public class ObjCallPre {
    public static void main(String[] args) {
        ObjCallPre myObj1 = new ObjCallPre();
        myObj1.sum(20,10);

        ObjCallPre myObj2 = new ObjCallPre();
        myObj2.sub(20,10);
    }
    protected void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    protected void sub(int a, int b){
        int sub = a - b;
        System.out.println("Sub is: " + sub);
    }
}
