/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shen_7_primes;

/**
 *
 * @author ShadowX
 */
public class Shen_7_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int half = i / 2 + 5;
            for (int j = 2; j <= half; j++) {
                if ((i % j == 0) & (i != j)) {
                    break;
                }
                else if ((i % j != 0) & (j == half) & (i!= 1)) {
                   System.out.println(i + " is Prime. ");
                }
            }
        }
    }
}
   