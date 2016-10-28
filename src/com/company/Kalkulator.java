package com.company;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę:");
        Scanner scanner1 = new Scanner(System.in);
        int liczba1 = scanner1.nextInt();

        System.out.println("Jakie działanie?");
//        Scanner scanner3 = new Scanner(System.in);
        String działanie = scanner1.next();

        System.out.println("Podaj drugą liczbę:");
//        Scanner scanner2 = new Scanner(System.in);
        int liczba2 = scanner1.nextInt();

//        tak na prawdę można scanner wykorzystać tylko raz i podawać nowe dane przy każdej konieczności8

    int wynikPolicz = policz(liczba1, liczba2, działanie);
        System.out.println(wynikPolicz);

//    int wynik = policzSwitchem (liczba1, liczba2, działanie);
//    System.out.println(wynik);
    }

     public static int policz(int liczba1, int liczba2, String działanie) {
        if (działanie.equals("+"))
            System.out.println(liczba1 + liczba2);
        else if (działanie.equals("-"))
            System.out.println("Twoja liczba to: " + (liczba1 - liczba2));
        else if (działanie.equals("*"))
            System.out.println(liczba1 * liczba2);
        else if (działanie.equals("/"))
            return (liczba1 / liczba2);
        else
            System.out.println("Nieprawidłowe działanie!");
         return 0;
     }


    public static int policzSwitchem (int liczba1, int liczba2, String działanie) {
        switch(działanie) {
            case "+":
                return liczba1 + liczba2;
            case "-":
                return liczba1 - liczba2;
            case "*":
                return liczba1 * liczba2;
            case "/":
                System.out.println(liczba1 / liczba2);
        }
        return 0;
    }
}
