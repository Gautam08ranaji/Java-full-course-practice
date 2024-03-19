package OOPS.pOLYmORPHISM.MethodOverLoading;

public class CaluclatorDriver {
    public static void main(String[] args) {
        Calculator.add(5,5);
        System.out.println();

        System.out.println("=============================");
        Calculator.add(5,10.2);

        System.out.println();
        System.out.println("=============================");
        Calculator.add(5,4,1.2);

        System.out.println();
        System.out.println("=============================");
        Calculator.add(5,5,5);
    }

}
