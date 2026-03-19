package colecciones.ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PeliculasDeUnTema {

	private String tema;
	private LinkedList<Pelicula> listaPeliculasDeUnTema;
	
	public PeliculasDeUnTema(String tema) {
		this.tema=tema;
		listaPeliculasDeUnTema=new LinkedList<Pelicula>();
	}
	
	public String getTema() {
		return getTema();
	}
	
	public void addPelicula (Pelicula pelicula)  throws NetPleaseException{
		
	  if (pelicula == null || pelicula.getAnnoEstreno() > LocalDate.now().getYear() || this.listaPeliculasDeUnTema.contains(pelicula) ) {
	    throw new NetPleaseException ("Error al agregar la película.");
	  }
	  
		 listaPeliculasDeUnTema.add(pelicula);
		 Random r = new Random();
		 this.annadirOpinionAPelicula(pelicula.getTitulo(), new Opinion(r.nextInt(10), "bla"));
	}
	
	public void borrarLasPeliculasDeUnAnno(int anno) throws NetPleaseException {
		Pelicula ultimaBorrada = null;
		
		Iterator<Pelicula> it = this.listaPeliculasDeUnTema.iterator();
		
		while (it.hasNext()) {
		  Pelicula p = it.next();
		  if (p != null && p.getAnnoEstreno() == anno) {
		    ultimaBorrada = p;
		    it.remove();
		  }
		}
		
		if (ultimaBorrada == null) {
		  throw new NetPleaseException ("No hay películas de ese año.");
		}
	}
	
	public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetPleaseException {
		if (opinion == null) {
		  throw new NetPleaseException("La opinion no puede ser null.");
		}
		
		Pelicula p = this.buscarPeliculaPorTitulo(tituloPelicula);
		p.annadirOpinion(opinion);
	}
	
	public List<Pelicula> listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
	  @SuppressWarnings ("unchecked")
    List<Pelicula> listaOrdenada = (List<Pelicula>) this.listaPeliculasDeUnTema.clone();

		Collections.sort(listaOrdenada, new Comparator<Pelicula> () {
          public int compare (Pelicula p1, Pelicula p2) {
            if (p1 == null && p2 == null) {
              return 0;
            }
            else if (p1 == null && p2 != null) {
              return 1;
            }
            else if (p2 == null) {
              return -1;
            }
            else if (p1.mediaDeOpiniones() == p2.mediaDeOpiniones()) {
              return 0;
            }
            else if (p1.mediaDeOpiniones() > p2.mediaDeOpiniones()) {
              return -1;
            }
            else {
              return 1;
            }
          }
        }
    );
		
		return listaOrdenada;
	}
	
	
	public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {
		List<Pelicula> listaPorActores = new ArrayList<Pelicula>();
		
		Iterator<Pelicula> it = this.listaPeliculasDeUnTema.iterator();
		while (it.hasNext()) {
		  Pelicula p = it.next();
		  if (p != null && p.participaActor(actor)) {
		    listaPorActores.add(p);
		  }
		}
		
		return listaPorActores;
	}
	
	
	public Pelicula buscarPeliculaPorTitulo(String titulo) throws NetPleaseException {
	  Pelicula encontrada = null;
	  
	  Iterator<Pelicula> it = this.listaPeliculasDeUnTema.iterator();
	  while (encontrada == null && it.hasNext()) {
	    Pelicula p = it.next();
	    if (p != null && (  ( titulo != null && titulo.equals(p.getTitulo()) ) || (titulo == null && titulo == p.getTitulo()) )) {
	      encontrada = p;
	    }
	  }
	  
	  if (encontrada == null) {
	    throw new NetPleaseException ("No existe una película con ese título.");
	  }
		return encontrada;
	}
	
	public boolean borrar(String titulo) {
	  try {
	    Pelicula p = this.buscarPeliculaPorTitulo(titulo);
	    return this.listaPeliculasDeUnTema.remove(p);
	  }
		catch (NetPleaseException ex) {
		  return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculasDeUnTema other = (PeliculasDeUnTema) obj;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Tema " + tema + "\n");
		for (Pelicula pelicula: listaPeliculasDeUnTema) {
			sb.append(pelicula +"\n");
		}
		return sb.toString();
	}
	
	
}
