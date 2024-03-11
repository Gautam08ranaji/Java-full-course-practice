package com.example.java1mc.JSPIDERJAVA.ConstructorChaining;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("mango");
        f1.display();


        Fruit f2 = new Fruit("mango",100);
        f2.display();

        Fruit f3 = new Fruit("mango",100,4.2);
        f3.display();


        Fruit f4 = new Fruit("mango",100,4.2,"yellow");
        f4.display();

        Fruit f5 = new Fruit(f2);
        f5.display();

    }
}
