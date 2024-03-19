package OOPS.pOLYmORPHISM.MethodOverLoading;

public class Calculator {
    int sum=0;
    public static void add(int a, int b){
        int sum=0;
        sum=a+b;
        System.out.println("TWO INTEGER TYPE METHOD: SUM IS --->  "+sum);
    }
    public static void add(int a , int b , int c){
        int sum=0;
        sum=a+b+c;
        System.out.println("THREE INTEGER TYPE METHOD: SUM IS --->  "+sum);
    }
    public static void add(int a , double b){
        double sum=0;
        sum=a+b;
        System.out.println("INT , DOUBLE TYPE METHOD: SUM IS --->  "+sum);    }
    public static void add(int a , int b , double c){
        double sum=0;
        sum=a+b+c;
        System.out.println("TWO INTEGER , ONE DOUBLE TYPE METHOD: SUM IS --->  "+sum);
    }
}
