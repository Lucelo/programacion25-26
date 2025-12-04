package R3_2;

import java.time.LocalDate;

public class Mensaje {


    public String asunto;
    public String Cuerpo;
    public LocalDate fechaEnvio;

    public String remitente;
    public String destinatario;

    Mensaje(String asunto, String Cuerpo, LocalDate fechaEnvio, String remitente, String destinatario) {
        this.asunto = asunto;
        this.Cuerpo = Cuerpo;
        this.fechaEnvio = fechaEnvio;
        this.remitente = remitente;
        this.destinatario = destinatario;

    }

    public String toString() {
        return "Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", remitente='" + remitente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", fecha=" + fechaEnvio +
                '}';
    }
}
