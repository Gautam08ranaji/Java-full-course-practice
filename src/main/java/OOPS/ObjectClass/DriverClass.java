package OOPS.ObjectClass;

public class DriverClass  extends B{
    int x= 12;
    public static void main(String[] args) {
        B a = new DriverClass();
        a.show1();

        DriverClass d = (DriverClass) a;
        System.out.println(d.x);
    }
}
