package OOPS.ClassAndObjects;

public class FrtuitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();


        f1.name = "BANANA";
        f1.price = 60;


        f2.name="APPLE";
        f2.price=80;


        f3.name="ORANGES";
        f3.price=30;




        System.out.println("FRUIT DETAILS-----------------------");
        System.out.println(f1.name);
        System.out.println(f1.price);
        f3.taste();


        System.out.println("FRUIT DETAILS-----------------------");
        System.out.println(f1.name);
        System.out.println(f1.price);
        f3.taste();

        System.out.println("FRUIT DETAILS-----------------------");
        System.out.println(f1.name);
        System.out.println(f1.price);
        f3.taste();

    }
}
