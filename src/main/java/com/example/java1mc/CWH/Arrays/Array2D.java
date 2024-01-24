package com.example.java1mc.CWH.Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int rows = sc.nextInt();

        System.out.println("enter the number of columns ");
        int coloumns = sc.nextInt();

        int matrix [][] = new int[rows][coloumns];

        for (int i = 0; i <rows ; i++) {
            System.out.println(" enter the values for "+i+" row");
            for (int j = 0; j <coloumns ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("OUTPUT ");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <coloumns ; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("enter the number to be searched");

        int x = sc.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <coloumns ; j++) {
                if (matrix[i][j]==x) {
                    System.out.println(x+ ": is present at index of ("+i+","+j+")");
                }
            }
        }
    }
}

