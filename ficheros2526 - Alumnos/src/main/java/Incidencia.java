import java.util.List;

/**
 * - Representa los datos individuales de una incidencia real de aeronave.
 * * @param codigoVuelo - Código identificador del vuelo (ej: IB3412).
 * @param fecha - Fecha del evento formateada en DD/MM/AAAA.
 * @param hora - Hora del evento en formato HH:MM:SS.
 * @param descripcion - Texto descriptivo con los detalles del suceso.
 */
public record Incidencia(String codigoVuelo, String fecha, String hora, String descripcion) {
}
