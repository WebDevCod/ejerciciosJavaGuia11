package servicio;

import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    Scanner scan = new Scanner(System.in);

    ArrayList<Carta> monton = new ArrayList();

    public void barajar(ArrayList<Carta> cartas) {
        System.out.println("----------------------");

        Collections.shuffle(cartas);
        System.out.println("¡Listo!");
        acumulador = 0;

        System.out.println("----------------------");
    }

    int acumulador;

    public void siguienteCarta(ArrayList<Carta> cartas) {

        System.out.println("----------------------");

        if (cartas.size() > acumulador) {
            String palo = cartas.get(acumulador).getPalo();
            int num = cartas.get(acumulador).getNumero();
            System.out.println("Palo: " + palo + " - " + "Número: " + num);
            acumulador++;
        } else {
            System.out.println("No hay más cartas para mostrar.");
        }

        System.out.println("----------------------");

    }

    public void cartasDisponibles(ArrayList<Carta> cartas) {

        System.out.println("----------------------");

        System.out.println("Cantidad de cartas que se pueden repartir: " + cartas.size());

        System.out.println("----------------------");

    }

    public void darCartas(ArrayList<Carta> cartas) {

        System.out.println("----------------------");

        System.out.println("Cantidad de cartas a dar:");
        int cantDeCartas = scan.nextInt();
        if (cartas.size() >= cantDeCartas) {
            monton.addAll(cartas.subList(0, cantDeCartas));
            cartas.subList(0, cantDeCartas).clear();
        } else {
            System.out.println("No hay suficientes cartas en la baraja.");
        }

        System.out.println("----------------------");

    }

    public void cartasMonton() {

        System.out.println("----------------------");

        if (monton.isEmpty()) {
            System.out.println("No hay ninguna carta en el montón.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : monton) {
                System.out.println("Palo: " + carta.getPalo() + " - " + "Número: " + carta.getNumero());
            }
        }

        System.out.println("----------------------");

    }

    public void mostrarBaraja(ArrayList<Carta> cartas) {

        System.out.println("----------------------");

        System.out.println("Cartas en la baraja:");
        for (Carta carta : cartas) {
            System.out.println("Palo: " + carta.getPalo() + " - " + "Número: " + carta.getNumero());
        }

        System.out.println("----------------------");

    }

}
