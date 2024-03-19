package OOPS.Recursion;

import java.util.Scanner;

public class NumberOfDigitsInNumber {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        System.out.println(getNumber(n));
    }
    public static int getNumber(int n){

        if (n >0) {
            count++;
            n=n/10;
            getNumber(n);
        }

        return count;
    }
}
