/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.testrepo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Juego {

    public static void main(String[] args) {
        int numero;
        int numeroAleatorio;
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        
        int contador = 0;

        do {
            System.out.println("Dame un numero entre 1 y 20");
            
            numero = Integer.parseInt(teclado.nextLine());

            
            numeroAleatorio = r.nextInt(20) + 1;

            if (numero == numeroAleatorio) {
                System.out.println("Ganaste con el " + numero);

            } else {
                System.out.println("Pailas el numero era" + numeroAleatorio + " y no" + numero);
            }
            
            contador++;
        }while(numero != numeroAleatorio);
        
        System.out.println("Ganaste despues de "+contador+" intentos");
        
        
    
    }
}
