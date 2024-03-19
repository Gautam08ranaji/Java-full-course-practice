package OOPS.Recursion;

import java.util.Scanner;

public class getFactorial {
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter tthe number for factorial");
        int x = sc.nextInt();
        System.out.println(getFactorial(x));
    }
    public static int getFactorial(int x){

        if (x>0){
            fact*=x;
            getFactorial(x-1);
        }
        return fact;
    }
}
