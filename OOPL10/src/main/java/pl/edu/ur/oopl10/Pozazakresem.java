/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Pozazakresem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[10];
        try {
            for (int i = 0; i < 11; i++) {
                tab[i] = 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Przekroczono zakres tablicy");
        }
    }

}
