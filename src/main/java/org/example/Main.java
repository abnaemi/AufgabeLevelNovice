package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Abdul");

        int i = 0;
        while (i < 5) {
            System.out.println("Abdul");
            i++;
        }

//        String higherThanZero = methode1(0);
//        System.out.println(higherThanZero);
//
//        int quadratLösung = methode2(2);
//        System.out.println(quadratLösung);

        System.out.println("Wie heissen Sie?");

        Scanner input = new Scanner (System.in);
        String name = input.next();
        System.out.println("Moin " + name);

    }

    public static String methode1(int i) {
        if (i > 0) {
            return "Die Zahl ist größer als null";
        } else {
            return "Die Zahl ist nicht größer als null";
        }
    }


    public static int methode2(int i) {
        return i * i;
    }

    }

