package Boletin_1.R_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class R_7 {
    Scanner sc = new Scanner(System.in);

    public void main(String[] args) throws IOException {
        boolean salir = false;
        System.out.println("1. Listar Boletin_1.directorio");
        System.out.println("2. Listar Boletin_1.directorio y buscar " + "ficheros que comiencen por una palabra");
        System.out.println("3. Listar archivos con cierta " + "extensión de un Boletin_1.directorio");
        System.out.println("4. Buscar un archivo en un Boletin_1.directorio");
        System.out.println("5. Buscar recursivamente un archivo " + "en un Boletin_1.directorio");
        System.out.println("6. Salir");
        while (!salir) {
            int opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1 -> listarDirectorio(sc);
                case 2 -> listarDirectorioFichero(sc);
                case 3 -> listarArchivo(sc);
                case 4 -> buscarArchivoDirectorio(sc);
                case 5 -> buscarArchivo(sc);
                case 6 -> salir = true;
                default -> salir = true;
            }
        }
    }

    public static void listarDirectorio(Scanner sc) {
        System.out.println("Que directorio que quiere listar? ");
        String nombre = sc.nextLine();
        Path dir = Path.of("./src/Boletin_1/directorio/" + nombre);
        // Comprobar existencia
        if (!Files.exists(dir)) {
            System.out.println("El directorio no existe.");
            return;
        }
        // Comprobar que es directorio
        if (!Files.isDirectory(dir)) {
            System.out.println("No es un directorio.");
            return;
        }
        // Comprobar permisos
        if (!Files.isReadable(dir)) {
            System.out.println("No tienes permiso de lectura.");
            return;
        }
        try {
            Files.list(dir).forEach(path -> {
                try {
                    if (Files.isRegularFile(path)) {
                        double size = Files.size(path) / 1024.0;
                        System.out.println(path.getFileName() + ": " + size + "KB");
                    } else System.out.println(path.getFileName() + "(directorio)");
                } catch (IOException e) {
                    System.out.println("Error al leer archivo.");
                }
            });
        } catch (IOException e) {
            System.out.println("Error al acceder al directorio.");
        }
    }

    public static void listarDirectorioFichero(Scanner sc) {
        System.out.println("Que directorio que quiere listar? ");
        String nombre = sc.nextLine();
        System.out.println("Que fichero que quiere buscar? ");
        String fichero = sc.nextLine();
        Path dir = Path.of("./src/Boletin_1/R_7/" + nombre);
        // Comprobar existencia
        if (!Files.exists(dir)) {
            System.out.println("El directorio no existe.");
            return;
        } // Comprobar que es directorio
        if (!Files.isDirectory(dir)) {
            System.out.println("No es un directorio.");
            return;
        }
        // Comprobar permisos
        if (!Files.isReadable(dir)) {
            System.out.println("No tienes permiso de lectura.");
            return;
        }
        try {
            Files.list(dir).filter(p -> p.getFileName()
                            .toString().startsWith(fichero))
                    .forEach(path -> {
                        try {
                            if (Files.isRegularFile(path)) {
                                double size = Files.size(path) / 1024.0;
                                System.out.println(path.getFileName() + ": " + size + "KB");
                            } else System.out.println(path.getFileName() + "(directorio)");
                        } catch (IOException e) {
                            System.out.println("Error al leer archivo.");
                        }
                    });
        } catch (IOException e) {
            System.out.println("Error al acceder al directorio.");
        }
    }

    public static void listarArchivo(Scanner sc) {
        System.out.println("Que directorio que quiere listar? ");
        String nombre = sc.nextLine();
        System.out.println("Por que extension que quiere listar? ");
        String extension = sc.nextLine();
        Path dir = Path.of("./src/Boletin_1/R_7/" + nombre + "." + extension);
        // Comprobar existencia
        if (!Files.exists(dir)) {
            System.out.println("El directorio no existe.");
            return;
        } // Comprobar que es directorio
        if (!Files.isDirectory(dir)) {
            System.out.println("No es un directorio.");
            return;
        }
        // Comprobar permisos
        if (!Files.isReadable(dir)) {
            System.out.println("No tienes permiso de lectura.");
            return;
        }
        try {
            Files.list(dir).forEach(path -> {
                try {
                    if (Files.isRegularFile(path)) {
                        double size = Files.size(path) / 1024.0;
                        System.out.println(path.getFileName() + ": " + size + "KB");
                    } else System.out.println(path.getFileName() + "(directorio)");
                } catch (IOException e) {
                    System.out.println("Error al leer archivo.");
                }
            });
        } catch (IOException e) {
            System.out.println("Error al acceder al directorio.");
        }
    }

    public static void buscarArchivoDirectorio(Scanner sc) throws IOException {
        String ruta = sc.nextLine();
        String archivo = sc.nextLine();
        Path path = Path.of(ruta);
        // Comprobar existencia
        if (!Files.exists(path)) {
            System.out.println("No existe.");
            return;
        }
        Files.list(path).filter(p -> p.getFileName()
                        .toString().equals(archivo))
                .forEach(p -> {
                    try {
                        double size = Files.size(p) / 1024.0;
                        System.out.println(p.toAbsolutePath() + " - " + size + " KB");
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                });
    }

    public static void buscarArchivo(Scanner sc) throws IOException {
        String ruta = sc.nextLine();
        String archivo = sc.nextLine();
        Path path = Path.of(ruta + "/" + archivo);
        // Comprobar existencia
        if (!Files.exists(path)) {
            System.out.println("No existe.");
            return;
        }
        Files.walk(Path.of(ruta)).filter(p -> Files.isRegularFile(p)).filter(p -> p.getFileName().toString().equals(archivo)).forEach(p -> {
            try {
                double size = Files.size(p) / 1024.0;
                System.out.println(p.toAbsolutePath() + " - " + size + " KB");
            } catch (IOException e) {
                System.out.println("Error");
            }
        });
    }
}
