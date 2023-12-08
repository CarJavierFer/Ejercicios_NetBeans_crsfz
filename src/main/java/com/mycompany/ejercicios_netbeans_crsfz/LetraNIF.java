/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_netbeans_crsfz;

import java.util.Scanner;

/**
 *
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Al introducir el Nº de DNI el programa te dice la letra que te corresponde
 */
public class LetraNIF {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dni,resto;
        char letra;
        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J',
        'Z','S','Q','V','H','L','C','K','E'};
        
        System.out.print("Introduzca un Nº de DNI");
        dni=teclado.nextInt();
        resto = dni%23;
        letra = letras[resto];
        System.out.println("La letra correspondiente es " + letra);
        System.out.println("El NIF es" + dni + letra);
    }
    
}
