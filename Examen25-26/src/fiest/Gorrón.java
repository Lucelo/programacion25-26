package fiest;

public class Gorrón extends Invitado {

    public Gorrón(String nombre, int hambre, int aburrimiento) {
        super(nombre, hambre, aburrimiento);
    }



    public void reaccionar(Evento eventoActual, Invitado invitado) {

        if (eventoActual == Evento.CORTE_TARTA) {
            invitado.Hambre -= 30;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.MUSICA_ALTA) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.MÚSICA_BAJA) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.CHARLITA_COLOQUIAL) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.BAILE) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.PIÑATA) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
        if (eventoActual == Evento.APERTURA_REGALOS) {
            invitado.Hambre += 10;
            invitado.Aburrimiento += 10;
        }
    }
}
