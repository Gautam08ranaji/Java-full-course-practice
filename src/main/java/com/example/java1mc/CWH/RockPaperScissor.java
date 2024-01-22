package com.example.java1mc.CWH;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("WELCOME TO THE ROCK PAPER AND SCISSOR GAME");
        System.out.println();
        System.out.println("--------------------------------------------");

        int i=1;
        int user=0;
        int computer=0;
       while (i<=3){
           int randomNumber = random.nextInt(0,3);
//        System.out.println(randomNumber);

           System.out.println("enter 0 for rock, 1 for paper , 2 for scissor  ");
           int n = sc.nextInt();

           if (n==0 && randomNumber==1){
               System.out.println(randomNumber+" paper: computer wins");
               computer +=1;
           }
           else if (n==1 && randomNumber==0) {
               System.out.println(n+" paper: user wins");

               user += 1;
           } else if (n==0 && randomNumber==2) {
               System.out.println(n+" rock: user wins");
               user += 1;
           }
           else if (n==2 && randomNumber==0) {
               System.out.println(randomNumber + " rock: computer wins");
               computer +=1;

           }else if (n==2 && randomNumber==1) {
               System.out.println(n + " scissor: user wins");
               user += 1;
           }
           else if (n==1 && randomNumber==2) {
               System.out.println(randomNumber + " scissor: computer wins");
               computer +=1;
           } else if (n==randomNumber) {
               System.out.println("game tie");
           }
           i++;
       }
        System.out.println("\n--------------------------------------------");
        if (user!=computer){
            String finalResult = user>computer?user+" "+ computer+" final winner is user wins":user+" "+ computer+" final winner is computer wins";
            System.out.println(finalResult);
        }else {
            System.out.println("final result is game tie");
        }
    }
}
