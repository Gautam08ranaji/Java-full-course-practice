package OOPS.Recursion;

import java.util.Scanner;

public class Factorial {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for factorial");
        n = sc.nextInt();

        System.out.println(getFactorial(n));

    }
    public static int getFactorial(int x){
        if (x >1 ) {
            return  x*getFactorial(x-1);

        }else return x;

    }
}
