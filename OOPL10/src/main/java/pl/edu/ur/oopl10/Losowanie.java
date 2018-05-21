/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author rafineria123
 */
public class Losowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random losuj = new Random();
        int liczba1, liczba2;
        int licz = 0;
        while (true) {
            liczba1 = losuj.nextInt(21) - 10;
            liczba2 = losuj.nextInt(21) - 10;
            System.out.println(liczba1);
            System.out.println(liczba2);
            try {
                int wynik = liczba1 / liczba2;
                System.out.println("Wynik= " + wynik);
            } catch (ArithmeticException e) {
                if (licz < 2) {
                    System.out.println("DZIELENIE PRZEZ 0");
                    System.out.println(e.toString());
                    licz = licz + 1;
                } else {
                    System.out.println("DZIELENIE PRZEZ 0");
                    System.out.println(e.toString());
                    break;
                }

            }
        }

    }

}
