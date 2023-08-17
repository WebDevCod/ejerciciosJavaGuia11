package ejercicio3relacionesclases;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.BarajaServicio;

public class Ejercicio3RelacionesClases {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Carta> cartas = new ArrayList();
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};

        for (String palo : palos) {
            for (int j = 1; j <= 12; j++) {
                if (j != 8 && j != 9) {
                    Carta carta = new Carta();
                    carta.setPalo(palo);
                    carta.setNumero(j);
                    cartas.add(carta);
                }
            }
        }

        Baraja baraja = new Baraja();
        baraja.setCartas(cartas);
        BarajaServicio bs = new BarajaServicio();
        ArrayList<Carta> cartasEnBaraja = baraja.getCartas();

        int opcion;
        do {

            System.out.println("1)Barajar");
            System.out.println("2)Siguiente carta");
            System.out.println("3)Cartas disponibles");
            System.out.println("4)Dar cartas");
            System.out.println("5)Cartas en el montón");
            System.out.println("6)Mostrar baraja");
            System.out.println("7)Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    bs.barajar(cartasEnBaraja);
                    break;
                case 2:
                    bs.siguienteCarta(cartasEnBaraja);
                    break;
                case 3:
                    bs.cartasDisponibles(cartasEnBaraja);
                    break;
                case 4:
                    bs.darCartas(cartasEnBaraja);
                    break;
                case 5:
                    bs.cartasMonton();
                    break;
                case 6:
                    bs.mostrarBaraja(cartasEnBaraja);
                    break;
                case 7:
                    System.out.println("¡Nos vemos!");
                    break;
                default:
                    System.out.println("Debes elegir una opción del menú.");
            }

        } while (opcion != 7);

    }

}
