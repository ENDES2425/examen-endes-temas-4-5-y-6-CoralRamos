/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author Coral
 */
    public class Pájaro {

        /**
         * @return the especie
         */
        public String getEspecie() {
            return especie;
        }

        /**
         * @param especie the especie to set
         */
        public void setEspecie(String especie) {
            this.especie = especie;
        }

        /**
         * @return the envergadura
         */
        public double getEnvergadura() {
            return envergadura;
        }

        /**
         * @param envergadura the envergadura to set
         */
        public void setEnvergadura(double envergadura) {
            this.envergadura = envergadura;
        }

        /**
         * @return the peso
         */
        public double getPeso() {
            return peso;
        }

        /**
         * @param peso the peso to set
         */
        public void setPeso(double peso) {
            this.peso = peso;
        }
//Aquí se almacena la información del pájaro
/**
Clase que representa informacion de pajaro
 */
    private String especie;
    private double envergadura;
    private double peso;
    }

public void imprimir_cabecera() {
    /**
     * Método que muestra la sección del animal, el número de registro, el nombre del animal, 
     * peso del animal,envergadura del animal y nombre de la especie
    */
    System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES");
    System.out.println("Registro Sanitario No 48/38751");
    System.out.println("Para consultar el nombre del animal revise la etiqueta");
        imprimir_detalle();
}

    private void imprimir_detalle() {
System.out.println("Peso: " + this.peso);
System.out.println("Envergadura: " + this.envergadura);
System.out.println("Nombre de la especie: " + this.especie);
    }
