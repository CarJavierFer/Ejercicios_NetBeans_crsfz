/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author crsfz
 * El programa crea una lista enlazada (LinkedList) con valores del 1 al 7
 * baraja los elementos de la lista
 * los almacena en un array y luego imprime los elementos barajados en la consola
 * Este ejercicio muestra el uso de colecciones en Java, específicamente la clase LinkedList y la utilidad Collections.shuffle
 */


public class Valores {

      public static void main(String[] args) {
        // Crear una lista enlazada con valores del 1 al 7
        LinkedList<Integer> listaEnlazada = new LinkedList<>();
        for (int i = 1; i <= 7; i++) {
            listaEnlazada.add(i);
        }

        // Barajar los elementos de la lista
        Collections.shuffle(listaEnlazada);

        // Almacenar los elementos barajados en un array
        Integer[] arrayBarajado = listaEnlazada.toArray(new Integer[0]);

        // Imprimir los elementos barajados en la consola
        System.out.println("Elementos barajados:");
        for (Integer elemento : arrayBarajado) {
            System.out.println(elemento);
        }
    }
}

