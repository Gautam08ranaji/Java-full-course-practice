package com.example.java1mc.JSPIDERJAVA.ConstructorChaining;

public class Fruit {

    String name;
    int price;
    double weight;
    String color;

    Fruit(){
        System.out.println("object is created");
    }

    Fruit(String name){
        this();
        this.name = name;
    }

    Fruit(String name,int price ){
        this(name);
        this.price= price;
    }
    Fruit(String name,int price,double weight ){
        this(name,price);
        this.weight= weight;
    }
    Fruit(String name,int price,double weight ,String color){
        this(name,price,weight);
        this.color= color;
    }

    Fruit(Fruit x){


        System.out.println("This Is Copy Constructor");
        this.name = x.name;
        this.price=x.price;
        this.weight=x.weight;
        this.color=x.color;

    }

    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Price is: "+price);
        System.out.println("Weight is: "+weight);
        System.out.println("Color is: "+color);
        System.out.println("----------------------------");
    }
}
