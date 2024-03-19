package OOPS.Recursion;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 num");
        int a= sc.nextInt();
        System.out.println("enter 2 num");
        int b= sc.nextInt();
        getBig(a,b);

    }
    public static int getBig(int a, int b){
        Scanner sc = new Scanner(System.in);
        int big;
        char q;



        do {


            System.out.println("do you want to continue");
            q= sc.next().charAt(0);
            System.out.println("enter another number");


            int c = sc.nextInt();

            big = getBig(a>b?a:b,c);

        }while (q=='y'||q=='Y');




        return big;
    }
}
