/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


public class Mediciones {

    private String fecha;
    private double temperatura;
    private double nivelDeCarga;
    private double milimetrosDeAgua;

    public Mediciones() {
    }
    public double getTemperatura() {
        return temperatura;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

       
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getNivelDeCarga() {
        return nivelDeCarga;
    }

    public void setNivelDeCarga(double nivelDeCarga) {
        this.nivelDeCarga = nivelDeCarga;
    }

    public double getMilimetrosDeAgua() {
        return milimetrosDeAgua;
    }

    public void setMilimetrosDeAgua(double milimetrosDeAgua) {
        this.milimetrosDeAgua = milimetrosDeAgua;
    }

}
