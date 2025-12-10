package Mantenimiento_de_un_avión;


public class avión {

    String marca;

    String modelo;

    int consumo;

        int capacidadMaxima;

        int capacidadActual;

        registro[] registroDeRevisiones;

    avión(
            String marca,
            String modelo,
            int consumo,
            int capacidadMaxima,
            int capacidadActual

    ){
        this.marca= marca;
        this.modelo=modelo;
        this.consumo=consumo;
        this.capacidadMaxima=capacidadMaxima;
        this.capacidadActual=capacidadActual;
        this.registroDeRevisiones = new registro[10];

    }


}
