package com.company;

public class Main {

    public static void main(String[] args) {

        printMyName();
        printSum();
        printHi();
        printOp();
    }


    public static void printMyName(){
        System.out.println("Hello world");
        System.out.println("Hello \n Alexandru");

    }


    public static void printSum(){
        int a,b;
        a = 5;
        b = 10;
        int sum=a+b;
        System.out.println();
        System.out.println("Suma numerelor 5 si 10 este: "+sum);

    }

    public static void printHi(){
        double c,d;
        c = 10;
        d = 3;
        double rez =c/d;
        System.out.println();
        System.out.println("Rezultatul impartirii numarului 10 la 3 este: " +rez);

    }
    public static void printOp(){
        System.out.println();
        System.out.println(-5+8*6);
        System.out.println((55+9) % 9);
        float e, f, g, h;
        e=20;
        f=-3;
        g=5;
        h=8;
        float rezultat = ((e + (f * g) / h));
        System.out.println(+rezultat);
        System.out.println (5+15/3*2-8%3);
    }
}
