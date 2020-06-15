/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1.tp.pkg15.pkg06.pkg2020;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Ex1TP15062020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double N1;
        
    Scanner enter= new Scanner (System.in);
    System.out.println ("Digite um número: ");
    N1= enter.nextDouble();
    
    if (N1 %2 == 0)
         System.out.println ("O número é par");
    
    else
        System.out.println ("O número é ímpar");
        // TODO code application logic here
    }
    
}
