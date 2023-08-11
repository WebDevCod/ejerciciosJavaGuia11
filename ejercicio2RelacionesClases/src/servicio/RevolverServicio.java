package servicio;

import entidad.Revolver;

public class RevolverServicio {

    Revolver revolver = new Revolver();

    public Revolver llenarRevolver() {

        revolver.setPosicionActual((int) (Math.random() * 6) + 1);
        revolver.setPosicionAgua((int) (Math.random() * 6) + 1);

        return revolver;

    }

    public boolean mojar(Revolver r) {
       
        boolean resp = false;
        if (r.getPosicionAgua() == r.getPosicionActual()) {
            resp = true;
        }
        return resp;

    }

    public void siguienteChorro(Revolver r) {

        int posicionActual = r.getPosicionActual();
        int posicionActualizada = posicionActual + 1;
        r.setPosicionActual(posicionActualizada);

    }

    public void mostrarInfoRevolver() {

        System.out.println("Posición actual: " + revolver.getPosicionActual());
        System.out.println("Posición donde está el agua: " + revolver.getPosicionAgua());

    }

}
