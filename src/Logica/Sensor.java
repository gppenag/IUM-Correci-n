/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Excepciones.NivelCargaException;


public abstract class Sensor {

    protected static final String[] TIPO = {"MilimetrosA", "TemperaturaA", "NivelCE"};
    protected String tipo;
    protected String Marca;
    protected String referencia;
    protected String Fechains;

    public Sensor(String Marca, String referencia, String Fechains) {
        this.Marca = Marca;
        this.referencia = referencia;
        this.Fechains = Fechains;
    }

    public void tipo() throws NivelCargaException {
        if (tipo.equals(TIPO[0])) {
            Sensor a = new MilimetrosA(Marca, referencia, Fechains);
        }
        if (tipo.equals(TIPO[1])) {
            Sensor a = new TemperaturaA(Marca, referencia, Fechains);
        }
        if (tipo.equals(TIPO[2])) {
            Sensor a = new NivelCE(Marca, referencia, Fechains);
        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFechains() {
        return Fechains;
    }

    public void setFechains(String Fechains) {
        this.Fechains = Fechains;
    }

    public abstract String registro();



}
