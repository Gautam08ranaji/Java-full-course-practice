package OOPS.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static  int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Disks");
        int n = sc.nextInt();

        char s ;
        char d ;
        char h;

        getMoves(n,'A','B','C');
        System.out.println("TOTAL NO OF MOVES FOR "+n+" DISK IS "+count);

    }
    public static void   getMoves(int n, char s, char d , char h){
        count++;
        if (n == 1) {
            System.out.println("MOVE DISK "+n+" FROM "+s+" TO "+d);
            return ;
        }
        getMoves(n-1,s,h,d);
        System.out.println("MOVE DISK "+n+" FROM "+ s+" TO "+d);
        getMoves(n-1,h,d,s);
        return ;
    }
}
