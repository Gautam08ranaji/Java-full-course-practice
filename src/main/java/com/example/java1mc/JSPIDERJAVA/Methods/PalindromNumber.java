package com.example.java1mc.JSPIDERJAVA.Methods;

public class PalindromNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <=5000 ; i++) {
            if (checkPalindrom(i)) {
                System.out.print(i+"  ");
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean checkPalindrom(int n){
        int rev=0;
        int a=n;

        while (n>0)
        {
            int rem = n%10;
            rev = 10*rev+rem;
            n/=10;
        }
        return rev==a;
    }
}
