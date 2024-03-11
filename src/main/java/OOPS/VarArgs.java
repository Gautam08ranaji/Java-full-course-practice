package OOPS;

public class VarArgs {

    public static int sum(int...args){
        int sum = 0;
        for (int a:args) {
            sum  +=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(7, 3, 77));

        System.out.println(sum());
        System.out.println(sum(8,8));
    }
}
