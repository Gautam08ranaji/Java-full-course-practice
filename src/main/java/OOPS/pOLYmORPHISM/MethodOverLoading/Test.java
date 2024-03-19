package OOPS.pOLYmORPHISM.MethodOverLoading;

public class Test {
    public static void main(String[] args) {
    show(3576856855555555554423443324324334432533552435535353333333335555555555555555555555555555555.0);
    }
    public static void show(double...a){
        System.out.println("double var args method");

    }
    public static void show(long...a){
        System.out.println("long var args method");
    }

}

