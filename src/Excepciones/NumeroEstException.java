/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;


public class NumeroEstException extends Exception {

    public NumeroEstException() {
        super("El numero de estaciones debe ser mayor a 3");
    }
}
