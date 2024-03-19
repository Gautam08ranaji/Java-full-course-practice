package OOPS.Recursion;

public class ControlledRecursion {
    static int count;
    public static void main(String[] args) {

        System.out.println("main method starts");
        test(1);
        System.out.println("main method ends");
    }
    public static void test(int x){
        count++;
        if (x <= 5) {
            System.out.println("this is recrsion "+count);
            test(x+1);
        }
    }
}
