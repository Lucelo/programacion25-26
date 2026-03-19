package colecciones.ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;


public class ListaGenerica<T extends Comparable<? super T>> {

	private LinkedList<T> lista;

	public ListaGenerica() {
		lista = new LinkedList<T>();
	}

	public void annadirElemento(T elemento) {
		lista.add(elemento);
	}

	public ListaGenerica<T> listaHastaElemento( T elementoBuscado) {
		ListaGenerica<T> listaReducida = new ListaGenerica<T>();
		
		boolean found = false;
		
		Iterator<T> it = this.lista.iterator();
		while (!found && it.hasNext()) {
		  T nextElement = it.next();
		  if ( (nextElement == null && nextElement == elementoBuscado) || (elementoBuscado != null && elementoBuscado.equals(nextElement)) ) {
		    found = true;
		  }
		  listaReducida.annadirElemento(nextElement);
		}
		
		return listaReducida;
	}


	public boolean isEmpty () {
	  return this.lista.isEmpty();
	}
	
	public ListaGenerica<T> elementosMenores (T elementoReferencia) {
	  if (elementoReferencia == null) {
	    throw new NullPointerException ();
	  }
	  ListaGenerica<T> listaMenores = new ListaGenerica<T>();
	  
	  Iterator<T> it = this.lista.iterator();
	  while (it.hasNext()) {
	    T elementoActual = it.next();
	    if (elementoReferencia.compareTo(elementoActual) > 0) {
	      listaMenores.annadirElemento(elementoActual);
	    }
	  }
	  
	  if (listaMenores.isEmpty() ) {
	    return null;
	  }
	  
	  return listaMenores;
	}

	@Override
	public String toString() {
		return "ListaGenerica=" + lista ;
	}
	
	
	
}
