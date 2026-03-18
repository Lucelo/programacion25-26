package colecciones.ejercicio2;

public class TestLista {


  public static void main (String[] args) {
    // TODO Auto-generated method stub
    ListaGenerica<Integer> lista = new ListaGenerica<>();
    
    for (int i = 11; i >= 0; i--) {
      lista.annadirElemento(Integer.valueOf(i));
    }
    
    ListaGenerica<Integer> listaMenor = lista.elementosMenores(6);
    ListaGenerica<Integer> otraLista = lista.listaHastaElemento(8);
  }

}
