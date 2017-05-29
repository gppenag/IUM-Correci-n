/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import Excepciones.*;
import Logica.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {

    public static ArrayList<Ciudad> ciudades = new ArrayList<>();

    public static void leerNuevasEstaciones(File a) throws FileNotFoundException, NumeroEstException, NivelCargaException, NCiudadesException {

        PrintStream escribir = new PrintStream(a);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos");
        System.out.println("Nombre de la ciudad:");
        String Ciudad = leer.nextLine();
        escribir.println(Ciudad);
        System.out.println("Numero de estaciones a registrar: ");
        try {
            int numeroEst = Integer.parseInt(leer.nextLine());
            escribir.println(numeroEst);

            ArrayList<EstacionMet> estaciones = new ArrayList<>();
            for (int i = 0; i < numeroEst; i++) {
                System.out.println("Nombre de la estacion " + (i + 1) + ":");
                String NombreEst = leer.nextLine();
                escribir.println(numeroEst);
                System.out.println("Numero de datos:");
                int numdatos = Integer.parseInt(leer.nextLine());
                ArrayList<Mediciones> mediciones = new ArrayList<>();

                for (int j = 0; j < numdatos; j++) {
                    System.out.println("Dato " + (j + 1));
                    System.out.println("fecha:");
                    String Fecha = leer.nextLine();
                    escribir.print(Fecha + "");
                    System.out.println("Temperatura:");
                    int Temperatura = Integer.parseInt(leer.nextLine());
                    escribir.print(Temperatura + "");
                    System.out.println("Cantidad de agua:");
                    int CantAgua = Integer.parseInt(leer.nextLine());
                    escribir.print(CantAgua + "");
                    System.out.println("Nivel eléctrico:");
                    int NivelElec = Integer.parseInt(leer.nextLine());
                    escribir.println(NivelElec + "");
                    Mediciones datos = new Mediciones();
                    datos.setFecha(Fecha);
                    datos.setTemperatura(Temperatura);
                    datos.setMilimetrosDeAgua(CantAgua);

                    datos.setNivelDeCarga(NivelElec);
                    mediciones.add(datos);
                }
                EstacionMet estacion = new EstacionMet(NombreEst, mediciones);
                estaciones.add(estacion);
            }
            Ciudad c = new Ciudad();
            c.setNombre(Ciudad);
            c.setEstaciones(estaciones);
            ciudades.add(c);


        } catch (NumeroEstException e) {
            e.getMessage();
        }
    }

    public static void CargarDatos(String a) throws FileNotFoundException, NumeroEstException {
        Scanner leer = new Scanner(new File(a));

        while (leer.hasNextLine()) {
            String NombreC = leer.nextLine();

            int NumEst = Integer.parseInt(leer.nextLine());
            ArrayList<EstacionMet> estaciones = new ArrayList<>();
            for (int i = 0; i < NumEst; i++) {
                String NE = leer.nextLine();

                int NumD = Integer.parseInt(leer.nextLine());
                ArrayList<Mediciones> mediciones = new ArrayList<>();
                for (int j = 0; j < NumD; j++) {
                    Mediciones data = new Mediciones();
                    String u = leer.nextLine();
                    String datos[] = u.split("[ ]+");
                    data.setFecha(datos[0]);
                    data.setTemperatura(Double.parseDouble(datos[1]));
                    data.setMilimetrosDeAgua((Double.parseDouble(datos[2])));
                    data.setNivelDeCarga(Double.parseDouble(datos[3]));
                    mediciones.add(data);
                }
                EstacionMet newEstacion = new EstacionMet(NE, mediciones);
                estaciones.add(newEstacion);
            }
            Ciudad c = new Ciudad();
            c.setNombre(NombreC);
            c.setEstaciones(estaciones);
            ciudades.add(c);

        }

    }

    public static void agregarCiudad(Ciudad c) {
        ciudades.add(c);
    }

}
