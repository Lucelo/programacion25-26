import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CopyLinesNIO {
    public static void main(String[] args) {

        Pattern patron = Pattern.compile("(?<nombre>\\p{Lu}\\p{Ll}+)\\s(?<ap1>\\p{Lu}\\p{Ll}+)\\s(?<ap2>\\p{Lu}\\p{Ll}+)\\s(?<curso>\\dº\\p{L}+)");
        Path archivo = Path.of("src", "files", "alumnos.txt");
        Path base = Path.of("src", "estructura_alumnos");

        try(Stream<String> lineas = Files.lines(archivo)){
            lineas.map(patron::matcher).flatMap(Matcher::results)
                    .forEach(result -> {
                        String curso = result.group("curso");
                        String alumno = result.group("ap1") + result.group("ap2") + result.group("nombre");

                        try {
                            Files.createDirectories(base.resolve(curso).resolve(alumno));
                        } catch (IOException e) {
                            throw new RuntimeException("Error al crear carpeta", e);
                        }
                    });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
