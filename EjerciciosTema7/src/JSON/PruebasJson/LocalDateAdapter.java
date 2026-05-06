package JSON.PruebasJson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateAdapter extends TypeAdapter<LocalDate> {

    // Método para Escribir (Exportar a JSON)
    @Override
    public void write(final JsonWriter jsonWriter, final LocalDate localDate) throws IOException {
        if (localDate == null) {
            jsonWriter.nullValue();
        } else {
            // Guardamos la fecha con el formato estándar ISO (YYYY-MM-DD)
            jsonWriter.value(localDate.toString());
        }
    }

    // Método para Leer (Importar de JSON)
    @Override
    public LocalDate read(final JsonReader jsonReader) throws IOException {
        return LocalDate.parse(jsonReader.nextString());
    }
}