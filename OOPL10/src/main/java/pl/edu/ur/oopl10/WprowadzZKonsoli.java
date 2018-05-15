/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            wprowadzInt();
        }
    }

    public static int wprowadzInt() {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        try {
            int liczba = wczytaj.nextInt();
            return liczba;
        } catch (Exception e) {
            System.out.println("WPROWADZONE DANE SA NIEPOPRAWNE");
            return wprowadzInt();
        }

    }
    
    public static String wprowadzString() {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        try {
            String liczba = wczytaj.next();
            return liczba;
        } catch (Exception e) {
            System.out.println("WPROWADZONE DANE SA NIEPOPRAWNE");
            return wprowadzString();
        }

    }

    
    public static float wprowadzfloat() {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj liczbe typu float: ");
        try {
            float liczba = wczytaj.nextFloat();
            return liczba;
        } catch (Exception e) {
            System.out.println("WPROWADZONE DANE SA NIEPOPRAWNE");
            return wprowadzfloat();
        }

    }
    
    public static short wprowadzshort() {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj liczbe typu short: ");
        try {
            short liczba = wczytaj.nextShort();
            return liczba;
        } catch (Exception e) {
            System.out.println("WPROWADZONE DANE SA NIEPOPRAWNE");
            return wprowadzshort();
        }

    }

}
