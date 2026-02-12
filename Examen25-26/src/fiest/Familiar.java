package fiest;

public class Familiar extends Invitado implements regaladores{

    public Familiar(String nombre, int hambre, int aburrimiento) {
        super(nombre, hambre, aburrimiento);
        setregalo();
    }

    setregalo(tiposDeRegalos){

      int regalo = (int) (Math.random() * (7 - 1) + 1);

       if (regalo ==1   ){

       } if (regalo==2){

        }


       return ;

    };

    public void reaccionar(Evento eventoActual, Invitado invitado) {

        if (eventoActual == Evento.CORTE_TARTA){
            invitado.Hambre -= 20;
            invitado.Aburrimiento +=10;
        }if (eventoActual == Evento.MUSICA_ALTA){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        } if (eventoActual == Evento.MÚSICA_BAJA){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        } if (eventoActual == Evento.CHARLITA_COLOQUIAL){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        } if (eventoActual == Evento.BAILE){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        } if (eventoActual == Evento.PIÑATA){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        } if (eventoActual == Evento.APERTURA_REGALOS){
            invitado.Hambre += 10;
            invitado.Aburrimiento +=10;
        }
    }



}
