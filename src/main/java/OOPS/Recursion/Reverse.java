package OOPS.Recursion;

public class Reverse {
    static  int rev=0;

    public static void main(String[] args) {
        System.out.println(getReverse(9987));
    }
    public static int getReverse(int n){
        if (n >0) {
            rev=10*rev+n%10;
            getReverse(n/10);
        }

        return rev;
    }
}
