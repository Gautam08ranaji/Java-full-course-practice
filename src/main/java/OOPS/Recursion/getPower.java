package OOPS.Recursion;

import java.util.Scanner;

public class getPower {

    static int pow=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         int a = sc.nextInt();
        System.out.println("enter the power");
         int b = sc.nextInt();
        System.out.println(getPower(a, b));
    }
    public static int getPower(int a,int b){

        if (b > 0) {
            pow = pow*a;
            getPower(a,b-1);

        }
        return pow;
    }
}
