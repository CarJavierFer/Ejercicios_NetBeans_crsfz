/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_netbeans_crsfz;

/**
 *
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Ejercicio de estructura repetitiva
 */
public class RepetirN {
    
    public static void main(String[] args) {
        int n = (int) (Math.random()*20);
        
        System.out.println("Numero de iteraciones: "+(n+1));
        
        for(int i=0; i<n; i++) {
            int x = (int) (Math.random()*(65-8)+18);
            
            System.out.println("Numero aleatorio"+1+": "+x);
        }
    }
    
}
