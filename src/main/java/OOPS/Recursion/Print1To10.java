package OOPS.Recursion;

public class Print1To10 {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int x){
        if (x <=10) {
            System.out.println(x+" ");
            printNum(x+1);
        }
    }
}
