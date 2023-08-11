package servicio;

import entidad.Revolver;

public class JugadorServicio {

    public boolean disparo(Revolver r) {

        RevolverServicio rs = new RevolverServicio();

        boolean resp = rs.mojar(r);
        if (!resp) {
            rs.siguienteChorro(r);
        }

        return resp;
    }
}
