package R3_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mensaje {


    public String asunto;
    public String Cuerpo;
    public LocalDate fechaEnvío;

    public String remitente;
    public String destinatario;

    Mensaje(String asunto,String Cuerpo,LocalDate fechaEnvío,String remitente,String destinatario){
        this.asunto=asunto;
        this.Cuerpo=Cuerpo;
        this.fechaEnvío = fechaEnvío;
        this.remitente=remitente;
        this.destinatario=destinatario;

    }
}
