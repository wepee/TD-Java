package fr.tse.fise2.td1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a, b;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        b = S.nextInt();

        System.out.println(Arithmetic.addition(a, b));

    }
}

