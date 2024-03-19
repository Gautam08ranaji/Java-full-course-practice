package com.example.java1mc.PatternPrinting.PatternPactice;

public class pattern8 {
    public static void main(String[] args) {
        int space =0;
        int star = 15;
        int n =star;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            if (i < (n/2)+1) {
                space++;
                star-=2;
            }
            else {
                space--;
                star+=2;
            }
            System.out.println();
        }
    }
}
