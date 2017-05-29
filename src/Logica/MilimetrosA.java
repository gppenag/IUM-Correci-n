/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


public class MilimetrosA extends Sensor {

    public MilimetrosA(String Marca, String referencia, String Fechains) {
        super(Marca, referencia, Fechains);
    }

    public String registro() {
         return "Sensor Milimetros de Agua{" + "tipo=" + super.tipo + ", Marca=" + super.Marca + ", referencia=" + super.referencia + ", Fechains=" + super.Fechains + '}';
       
    }



}
