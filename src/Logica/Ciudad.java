/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Excepciones.NumeroEstException;
import java.util.ArrayList;


public class Ciudad {

    private String nombre;
    private ArrayList<EstacionMet> estaciones;

    public Ciudad() {
       this.estaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EstacionMet> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<EstacionMet> estaciones) throws NumeroEstException {
        this.estaciones = estaciones;
        if(estaciones.size()< 3){
            throw new NumeroEstException();
        }
    }
    

    public String registroCiudad(){
        String inf =" inf" ;
        inf += "Ciudad{"+ "nombre=" + this.nombre + "estaciones=";
        for(EstacionMet e :estaciones){
          inf += " hola " +  e.toString()+ " ";
        }
        inf += " ";
        return inf;
    }

    
    
}
