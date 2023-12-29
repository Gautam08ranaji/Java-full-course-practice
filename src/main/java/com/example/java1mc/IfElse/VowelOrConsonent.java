//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//        Test Data
//        Input an alphabet: p
//        Expected Output :
//        Input letter is Consonant
package com.example.java1mc.IfElse;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an alphabet");
        String a = sc.next().toLowerCase();

        if (a.length() > 1 ){
            System.out.println("error. NOT A SINGLE CHARACTER");
        }
         else if  (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') {
            if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0) == 'u'){
                System.out.println(a+ " is vowel");
            } else  {
                System.out.println("alphabet is a consonet "+ a);
            }
        }else {
            System.out.println("enter an alphabet ");
        }

    }
}
