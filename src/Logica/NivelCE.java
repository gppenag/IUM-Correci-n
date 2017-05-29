/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Excepciones.NivelCargaException;


public class NivelCE extends Sensor {

    protected static final String[] TIPOC = {"1-TormentaElectrica", "2-Rayos", "3-Truenos", "4-Normal"};
    private String tipoc;

    public NivelCE(String Marca, String referencia, String Fechains) throws NivelCargaException {
        super(Marca, referencia, Fechains);
        this.tipoc = tipoc;
        if(tipoc != "1" &&tipoc != "2"&&tipoc != "3"&&tipoc != "4"){
            throw new NivelCargaException();
        }
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }

    @Override
    public String registro() {
      return "Sensor Nivel De Carga Electrica {" + "tipo=" + super.tipo + ", Marca=" + super.Marca + ", referencia=" + super.referencia + ", Fechains=" + super.Fechains + '}';
    }








}
