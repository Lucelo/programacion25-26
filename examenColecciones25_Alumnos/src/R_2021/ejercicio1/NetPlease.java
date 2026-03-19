package colecciones.ejercicio1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NetPlease {

	//Hashmap donde por cada tema, podemos acceder a las películas de ese tema
	private HashMap<String, PeliculasDeUnTema> mapPeliculas;
	
	
	public NetPlease() {
		mapPeliculas=new HashMap<String, PeliculasDeUnTema>();
		
	}
	
	public void annadirTema( String tema) throws NetPleaseException {
	
		tema= tema.toUpperCase();
		if (mapPeliculas.containsKey(tema)) {
			throw new NetPleaseException("Ya existe ese tema");
		}
		
		mapPeliculas.put(tema, new PeliculasDeUnTema(tema));
	}
	

	
	public void addPelicula(String tema, Pelicula pelicula) throws NetPleaseException {
		PeliculasDeUnTema listaPeliculasDeUnTema = mapPeliculas.get(tema);
		
		if (listaPeliculasDeUnTema == null) {
			throw new NetPleaseException("No existe el tema " + tema);
		}
		listaPeliculasDeUnTema.addPelicula(pelicula);
	}
	
	public void listadoDeTodasPeliculasDeTodosLosTemas() {
		
		for ( PeliculasDeUnTema listaPelisTema: mapPeliculas.values()) {
			System.out.println(listaPelisTema);
		}
	}
	
	public void listadoDeUnTema(String tema) {
		
		PeliculasDeUnTema listaPelisTema = mapPeliculas.get(tema);
		for (Pelicula p: listaPelisTema.listadoDePeliculasOrdenadasPorMediaDeOpiniones() ) {
			System.out.println(p);
		}
	}
	
	public void borrarPeliculaDeUnTema( String tema, String titulo) throws NetPleaseException{
	  if (!this.mapPeliculas.containsKey(tema)) {
	    throw new NetPleaseException ("No existe el tema.");
	  }
	  
	  PeliculasDeUnTema listaPeliculas = this.mapPeliculas.get(tema);
	  if (!listaPeliculas.borrar(titulo)) {
	    throw new NetPleaseException ("No existe la película con título: " + titulo);
	  }
	}
	
	
	
	public String temaDePelicula( String titulo) {
		String tema = null;
	  
	  Iterator<Entry<String, PeliculasDeUnTema>> it = this.mapPeliculas.entrySet().iterator();
	  while (it.hasNext()) {
	    Entry<String, PeliculasDeUnTema> par = it.next();
	    
	    try {
	      //si no se encuentra la película, se captura la excepción y se pasa a la siguiente iteración...
	      par.getValue().buscarPeliculaPorTitulo(titulo);
	      return par.getKey();
	    }
	    catch (NetPleaseException ex) {
	      //no se hace nada, porque aún hay que iterar...
	    }
	  }
	  
	  // Otra opción.
	  /*
		for (String t : this.mapPeliculas.keySet()) {
			try {
				this.mapPeliculas.get(t).buscarPeliculaPorTitulo(titulo);
				return t;
			} catch (NetPleaseException e) {

			}
		}
	  */
	  
	  return tema;
	}
	


	
	
}
