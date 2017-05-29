/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Archivo.BaseDeDatos;
import Excepciones.NCiudadesException;
import Excepciones.NivelCargaException;
import Excepciones.NumeroEstException;
import Logica.*;
import java.io.*;
import java.util.*;


public class Main {

    public static void MostrarPromedios() throws NCiudadesException {
        for (Ciudad ciudad : BaseDeDatos.ciudades) {
            if(BaseDeDatos.ciudades.size() != 12){
                throw new NCiudadesException();
            }
            for (EstacionMet estacion : ciudad.getEstaciones()) {
                System.out.println(estacion.PromedioAT() + " " + estacion.PromedioCA() + " " + estacion.PromedioNEL());
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, NumeroEstException, NivelCargaException, NCiudadesException {
        File f = new File("NuevasEstaciones");
        f.createNewFile();
        
      
        try {
            BaseDeDatos.CargarDatos("Archivo.txt");

        } catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }

        System.out.println("Elija una opcion");
        System.out.println("1.Registrar nuevas estaciones");
        System.out.println("2.Ver promedio de  los datos de los sensores");
        System.out.println("3.Registro histórico de datos");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        if (opcion == 1) {
            BaseDeDatos.leerNuevasEstaciones(f);
        }

        if (opcion == 2) {
            MostrarPromedios();
        }

        if (opcion == 3) {
            Scanner leerArchivo1 = new Scanner(new File ("Archivo.txt"));
            Scanner leerArchivo2 = new Scanner(f);
            while (leerArchivo1.hasNext()) {
                System.out.println(leerArchivo1.nextLine());
            }
            while (leerArchivo2.hasNext()) {
                System.out.println(leerArchivo2.nextLine());
            }

        }
    }
}
