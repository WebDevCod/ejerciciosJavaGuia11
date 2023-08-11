package ejercicio2relacionesclases;

import java.util.Scanner;
import servicio.JuegoServicio;
import servicio.RevolverServicio;
import entidad.Revolver;
import entidad.Jugador;
import java.util.ArrayList;

public class Ejercicio2RelacionesClases {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        JuegoServicio juegoServicio = new JuegoServicio();
        RevolverServicio revolverServicio = new RevolverServicio();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int response;
        do {
            System.out.println("1)Iniciar juego");
            System.out.println("2)Salir");
            response = scan.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Ingresa la cantidad de jugadores del 1 al 6");
                    int cantidadJugadores = scan.nextInt();

                    for (int i = 1; i <= cantidadJugadores; i++) {
                        Jugador jugador = new Jugador(i, "Jugador " + i, false);
                        jugadores.add(jugador);
                    }

                    Revolver revolver = revolverServicio.llenarRevolver();

                    juegoServicio.llenarJuego(jugadores, revolver);
                    juegoServicio.ronda();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Debes seleccionar un número del menú");
            }

        } while (response != 2);

    }

}
