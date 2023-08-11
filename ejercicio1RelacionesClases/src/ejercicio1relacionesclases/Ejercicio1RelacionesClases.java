package ejercicio1relacionesclases;

import entidad.Perro;
import entidad.Persona;

public class Ejercicio1RelacionesClases {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Blackie", "Border Collie", 3, "Mediano");
        Perro perro2 = new Perro("Chuletas", "Labrador", 1, "Pequeño");

        Persona persona1 = new Persona("Laura", "González", 35, "45896239", perro1);
        Persona persona2 = new Persona("Martín", "Rodríguez", 28, "52369467", perro2);

        System.out.println("Nombre: " + persona1.getNombre() + " - " + "Mascota: " + persona1.getPerro().getNombre());
        System.out.println("Nombre: " + persona2.getNombre() + " - " + "Mascota: " + persona2.getPerro().getNombre());

    }

}
