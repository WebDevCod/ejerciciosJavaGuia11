package servicio;

import entidad.Revolver;
import java.util.Objects;

public class RevolverServicio {

    public Revolver llenarRevolver() {
        Revolver revolver = new Revolver();
        revolver.setPosicionActual((int) (Math.random() * 6) + 1);
        revolver.setPosicionAgua((int) (Math.random() * 6) + 1);
        return revolver;
    }

    public boolean mojar(Revolver revolver) {
        return Objects.equals(revolver.getPosicionAgua(), revolver.getPosicionActual());
    }

    public void siguienteChorro(Revolver revolver) {
        int posicionActual = revolver.getPosicionActual();
        posicionActual = (posicionActual < 6) ? posicionActual + 1 : 1;
        revolver.setPosicionActual(posicionActual);
    }

}
