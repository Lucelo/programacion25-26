package R_1;

import java.io.Serial;

public class EquipoException extends Throwable {
    @Serial
    private static final long serialVersionUID = 1L;

    public EquipoException(String msg){
        super(msg);
    }
}
