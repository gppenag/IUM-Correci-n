/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Excepciones.NCiudadesException;
import java.util.ArrayList;

public class UIM {

    private ArrayList<Ciudad> ciudades;

    public UIM() throws NCiudadesException {
        this.ciudades = new ArrayList<>();
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void agregarCiudad(Ciudad ci) {
        ciudades.add(ci);
    }

    public String RegistroHistorico() {
        String infH = " ";
        for (Ciudad c : ciudades) {
            infH += c.registroCiudad() + " ";

        }
        return infH;
    }
}
