package com.example.java1mc.DoWhile;

public class NaturalNumbers {
    public static void main(String[] args) {
//        int i =1;
//
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<=5);

        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
