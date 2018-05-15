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
public class Testowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        Eksepszyn wyjatek = new Eksepszyn();
        wyjatek.dzielenie(x.nextInt(), x.nextInt());
    }
    
}
