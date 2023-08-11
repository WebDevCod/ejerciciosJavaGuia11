package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoServicio {

    Scanner scan = new Scanner(System.in);
    Juego juego = new Juego();

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }

    public void ronda() {
        ArrayList<Jugador> jugadores = juego.getJugadores();
        JugadorServicio jugadorServicio = new JugadorServicio();

        boolean resp = false;
        do {
            for (Jugador jugador : jugadores) {
                System.out.println("Turno: " + jugador.getNombre());
                System.out.print("Presiona Enter para disparar");
                scan.nextLine();

                resp = jugadorServicio.disparo(juego.getRevolver());

                if (resp) {
                    System.out.println("----------------------------");
                    System.out.println(jugador.getNombre() + " Game Over :(");
                    System.out.println("----------------------------");
                    break;
                } else {
                    System.out.println("¡Zafaste!");
                }
            }
        } while (!resp);

    }

}
