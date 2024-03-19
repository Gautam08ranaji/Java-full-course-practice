package OOPS.Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static Scanner sc = new Scanner(System.in);
    static int x;


    static int sum;
    public static void main(String[] args) {
        System.out.println("enter the number");
        x = sc.nextInt();

        getSum(x);
        System.out.println(sum);
    }
    public static int getSum(int x){
        if (x > 0 ) {
            sum+=x;
            getSum(x-1);
        }
        return sum;
    }
}
