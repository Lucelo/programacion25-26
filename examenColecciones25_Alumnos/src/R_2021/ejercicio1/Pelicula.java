package colecciones.ejercicio1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Respuesta al ejercicio. 
 * 
 * Me parece que son buenas elecciones en general.
 * LinkedList está bien si se asume que se va a tener que eliminar películas con cierta regularidad, pues es super 
 * eficiente al añadir y eliminar elementos intermedios dada su estructura interna. Para esta condición, ArrayList habría tenido 
 * dificultades en rendimiento, pues para un catálogo de películas grande habría que mover el resto de películas ya existentes
 * para cubrir el "vacío" dejado.
 * El ArrayList de opiniones es acertado, pues si se añaden las opiniones al final ArrayList es muy eficiente, sin embargo, si se contemplase
 * la opción de eliminarlas, entonces sería mejor un LinkedList por lo anteriormente mencionado. 
 * En el caso de actores, un hashset es una muy buena opción, pues el hecho de que no acepte valores duplicados facilita mucho el trabajo. Ahora
 * bien, si por algún casual hubiese actores con el mismo nombre (algo que no tiene que ser tan raro dados los nombramientos anglosajones), esta
 * colección se volvería un impedimento.
 * 
 */


public class Pelicula {
	private String titulo;
	private int annoEstreno;
	private ArrayList<Opinion> opiniones;
	private HashSet<String> actores;

	public Pelicula(String titulo, int annoEstreno) {
		super();
		this.titulo = titulo;
		this.annoEstreno = annoEstreno;
		actores= new HashSet<String>();
		opiniones = new ArrayList<Opinion>();
	}

	public void annadirOpinion(Opinion opinion) {
		opiniones.add(opinion);
	}

	public void annadirActor(String actor) {
		actores.add(actor);
	}
	
	

	public double mediaDeOpiniones() {
		int total = 0;
		
		if (this.opiniones.size() > 0) {
		  
	    Iterator<Opinion> it = this.opiniones.iterator();
	    while (it.hasNext()) {
	      Opinion op = it.next();
	      if (op != null) {
	        total += op.getValoracion();
	      }
	    }
	    
	    total /= this.opiniones.size();
		}
		
		return total;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnnoEstreno() {
		return annoEstreno;
	}

	public void setAnnoEstreno(int annoEstreno) {
		this.annoEstreno = annoEstreno;
	}
	
	public boolean participaActor (String nombreActor) {
	  return this.actores.contains(nombreActor);
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", annoEstreno=" + annoEstreno + "]" + " Media de opiniones " + mediaDeOpiniones();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
