package OOPS.Recursion;

import java.util.Scanner;

public class DigitCount {
    static  int count;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public static int getCount(int n){
        if (n >0) {
            count++;
            getCount(n/10);
        }return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount(778997869));
    }

}

