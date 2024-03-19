package OOPS.Recursion;

import java.util.Scanner;

public class bigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int a = sc.nextInt();
        System.out.println("enter second num");
        int b= sc.nextInt();
        System.out.println("The Biggest Number is: "+getBig(a, b));

        System.out.println("the biggest num is: "+getBig(getBig(11,92),getBig(getBig(56,66),77)));


    }
    public static int getBig(int a, int b){
        return a>b?a:b;
    }
}
