package com.example.java1mc.PatternPrinting.PatternPactice;

public class Butterfly {
    public static void main(String[] args) {
        int n = 10;
        int space=0;
        int star = 1;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }

            if (i<(n/2)+1){

                star++;
            }
            else {
                star--;
            }
            System.out.println();
        }
    }
}
