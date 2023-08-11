package servicio;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {

    public ArrayList<Jugador> ingresarJugadores() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        boolean errorCantidadJugadores = false;
        do {
            System.out.println("Ingresa la cantidad de jugadores del 1 al 6");
            int cantidadJugadores = scan.nextInt();
            if (cantidadJugadores >= 1 && cantidadJugadores <= 6) {
                for (int i = 1; i <= cantidadJugadores; i++) {
                    Jugador jugador = new Jugador(i, "Jugador " + i, false);
                    jugadores.add(jugador);
                }
            } else {
                errorCantidadJugadores = true;
            }
        } while (errorCantidadJugadores);

        return jugadores;
    }

    public boolean disparo(Revolver revolver) {
        RevolverServicio revolverServicio = new RevolverServicio();
        boolean resp = revolverServicio.mojar(revolver);

        if (!resp) {
            revolverServicio.siguienteChorro(revolver);
        }

        return resp;
    }
}
