package OOPS.Recursion;

import java.util.Scanner;

public class Power {
    Scanner sc = new Scanner(System.in);
    static int pow =1;

    int a = sc.nextInt();
    int b = sc.nextInt();
    public static void main(String[] args) {
          getPower(4,4);
        System.out.println(pow);

    }
    public static void getPower(int a,int b){
        if (b>0) {
            pow =pow*a;
            getPower(a,b-1);
        }
    }
}
