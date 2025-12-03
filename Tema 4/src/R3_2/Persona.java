package R3_2;

public class Persona {

    public String nombre;
    public Mensaje[] mensajesRecibidos;
    public Mensaje[] mensajesEnviados;

    private int recibidosCount = 0;
    private int enviadosCount = 0;
    Persona(String nombre){
        this.nombre= nombre;
        this.mensajesRecibidos = new Mensaje[5];
        this.mensajesEnviados = new Mensaje[5];
    }


    public void recibirMensaje(Mensaje m){
        if (recibidosCount < 5) {
            mensajesRecibidos[recibidosCount++] = m;
        }
    }

    public void enviarMensaje(Mensaje m){
        if (enviadosCount < 5) {
            mensajesEnviados[enviadosCount++] = m;
        }
    }

}
