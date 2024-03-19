package OOPS.Recursion;

public class InfiniteRecursion {
    static int x=0;

    public static void main(String[] args) {
        test();
    }
    public static void test(){
        x++;
        System.out.println("this is recursion "+x);
        test();
    }
}
