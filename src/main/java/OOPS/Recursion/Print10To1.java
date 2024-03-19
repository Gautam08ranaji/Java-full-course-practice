package OOPS.Recursion;

public class Print10To1 {
    public static void main(String[] args) {
        printNum(10);
    }
    public static void printNum(int x){
        if (x >0) {
            System.out.println(x+" ");
            printNum(x-1);
        }
    }
}
