

void main() {

    File f = new File("./src/leeme.txt");

    try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {

        IO.println("El contenido dentro de leeme tiene " + br.lines().count() + " lineas ");

    } catch (IOException e) {
        IO.println(e.getMessage());
    }


}


