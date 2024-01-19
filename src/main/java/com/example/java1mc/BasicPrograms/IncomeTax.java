package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SALARY IN --> 3.6 FORMAT");

        float salary = sc.nextFloat();
        float tax =0;

        if (salary <= 2.5) {
            System.out.println("zero tax");
        }
        else if (salary>2.5 && salary <=5.0) {
            tax =  tax + 0.05f *(salary-2.5f);
            System.out.println("you have to pay tax of "+tax + "Rs");
        }
        else if (salary>5.0f && salary <=10.0f) {
            tax =  tax + 0.05f *(5.0f-2.5f);
            tax =  tax + 0.2f *(salary-5f);
            System.out.println("you have to pay tax of "+tax + "Rs");
        }
        else if (salary>10.0 ) {
            tax =  tax + 0.05f *(5.0f-2.5f);
            tax =  tax + 0.2f *(10.0f-5f);
            tax =  tax + 0.3f *(salary-5f);
            System.out.println("you have to pay tax of "+tax + "Rs");
        }


    }
}
