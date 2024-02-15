package com.example.java1mc.JSPIDERJAVA.Methods;
public class Functions {
    public static void main(String[] args) {

        System.out.println(demo());
//        System.out.println(fun);  we cant call void method in sop

        fun();

    }

    public static void fun() {
        System.out.println("this is void method");
        return;
    }

    public static int demo() {
        int x = 40;
        System.out.println("this is demo method ");
        System.out.println("this is int method");

        return x+30;
    }


}
