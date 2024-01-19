package com.example.java1mc.CWH;

import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter km ");

        float km = sc.nextFloat();

        float miles = (float) (km*0.621371);

        System.out.println(km + "km = "+ miles +" miles");
    }
}
