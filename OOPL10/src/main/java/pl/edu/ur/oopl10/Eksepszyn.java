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
public class Eksepszyn extends Exception{
    
    public void dzielenie(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("Dzielenie przez zero");
        }
        else{
            System.out.println(a/b);
        }
        
    }
}
