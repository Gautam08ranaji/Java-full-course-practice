package com.example.java1mc.JSPIDERJAVA.Methods;

public class PerfectNumber {


        public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <=4000000 ; i++) {
                if (checkPerfectNumber(i)) {
                    System.out.print(i+"  ");
                    count++;
                }
            }
            System.out.println(count);

        }
        public static boolean checkPerfectNumber(int n){
            int sum=0;

            for (int i = 1; i <=n/2 ; i++) {
                if (n%i==0) {
                    sum+=i;
                }
            }

            return n==sum;
        }
    }


