/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_netbeans_crsfz;

/**
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Estructura de datos que nos permite alamcenar una gran cantidad de datos de un mismo tipo
 * Encapsulado
 */


public class Array {
        private static final int MAXVAL = 7;
        private Integer[] result;
        
        public static void main(String[] args) {
            new Array().run();
        }
     
        public void run() {
            java.util.LinkedList<Integer> l = new java.util.LinkedList<Integer>();
            for (int i = 0; i < MAXVAL; l.add(++i));
            java.util.Collections.shuffle(l);
            result = l.toArray(new Integer[0]);
            for (Integer i : result) System.out.println(i);
        }
}
