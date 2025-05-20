/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author Coral
 */
public class Animales {
/**
Clase que representa animales
 */
    public static void main(String[] args) {
/**
@param tipo de dato animales
 */    
        System.out.println("Hello World!");
    }

    public class Pájaro {
//Aquí se almacena la información del pájaro
/**
Clase que representa informacion de pajaro
 */
    String nombre_especie;
    double envergadura;
    double peso;
}

public void imprimir() {
    /**
     * Método que muestra la sección del animal, el número de registro, el nombre del animal, 
     * peso del animal,envergadura del animal y nombre de la especie
    */
    System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES");
    System.out.println("Registro Sanitario No 48/38751");
    System.out.println("Para consultar el nombre del animal revise la etiqueta");
    System.out.println("Peso: " + this.peso);
    System.out.println("Envergadura: " + this.envergadura);
    System.out.println("Nombre de la especie: " + this.nombre_especie);
}

}

