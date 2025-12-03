package R3_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
Scanner sc=new Scanner(System.in);

    DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yy");

    public void main(String[] args) {
        Persona Andres= new Persona("Andres");
        Persona Antonio= new Persona("Antonio");
        Persona Mario= new Persona("Mario");
        Persona Lucia= new Persona("Lucia");
        Persona Luigi= new Persona("Luigi");

        enviarMensaje(Andres, Lucia);


        System.out.println(Arrays.toString(Andres.mensajesEnviados));


    }

    void enviarMensaje(Persona p1, Persona p2){
        System.out.println("Asunto:");

        String asunto= sc.nextLine();

        System.out.println("Cuerpo:");

        String Cuerpo= sc.nextLine();

        System.out.println("Fecha (dd/MM/yy):");

        LocalDate fechaEnvío = LocalDate.parse(sc.next(), formatter);

        String remitente= p1.nombre;

        String destinatario= p2.nombre;

        Mensaje mensaje = new Mensaje(asunto,Cuerpo,fechaEnvío,remitente,destinatario);

        p1.enviarMensaje(mensaje);
        p2.recibirMensaje(mensaje);

    }

}
