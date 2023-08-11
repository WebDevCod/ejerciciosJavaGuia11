package ejercicio2relacionesclases;

import java.util.Scanner;
import servicio.JuegoServicio;
import servicio.RevolverServicio;
import entidad.Revolver;
import entidad.Jugador;
import java.util.ArrayList;
import servicio.JugadorServicio;

public class Ejercicio2RelacionesClases {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JuegoServicio juegoServicio = new JuegoServicio();
        JugadorServicio jugadorServicio = new JugadorServicio();
        RevolverServicio revolverServicio = new RevolverServicio();

        int response;
        do {
            System.out.println("1)Iniciar juego");
            System.out.println("2)Salir");
            response = scan.nextInt();

            switch (response) {
                case 1:
                    ArrayList<Jugador> jugadores = jugadorServicio.ingresarJugadores();
                    Revolver revolver = revolverServicio.llenarRevolver();
                    juegoServicio.llenarJuego(jugadores, revolver);
                    juegoServicio.ronda();
                    break;
                case 2:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Debes seleccionar un número del menú");
            }

        } while (response != 2);

    }

}
