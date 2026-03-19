package colecciones.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		NetPlease netPlease=new NetPlease();
		
		
		try {
			netPlease.annadirTema("COMEDIA");
			netPlease.annadirTema("ACCION");
			netPlease.annadirTema("DRAMA");
			
			netPlease.addPelicula("COMEDIA", new Pelicula("BAJO EL MISMO TECHO", 2019));
			netPlease.addPelicula("COMEDIA", new Pelicula("Matrix", 2010));
			netPlease.addPelicula("COMEDIA", new Pelicula("Matrix 2", 2010));
			
			netPlease.listadoDeUnTema("COMEDIA");
			
			
			
		} catch (NetPleaseException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
