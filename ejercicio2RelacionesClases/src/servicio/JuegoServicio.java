package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;

public class JuegoServicio {

    Juego juego = new Juego();

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {

        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);

    }

    public void ronda() {

        ArrayList<Jugador> jugadores = juego.getJugadores();
        JugadorServicio jugadorServicio = new JugadorServicio();

        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
            System.out.println(juego.getRevolver().getPosicionActual());
            System.out.println(juego.getRevolver().getPosicionAgua());
            boolean resp = jugadorServicio.disparo(juego.getRevolver());
            if (resp) {
                System.out.println(jugador.getNombre() + " Game Over");
                break;
            }
        }
    }

}
