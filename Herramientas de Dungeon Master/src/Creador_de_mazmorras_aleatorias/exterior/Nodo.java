package Creador_de_mazmorras_aleatorias.exterior;

import java.util.ArrayList;
import java.util.List;

  public class Nodo {

      private String id;
      private Nodo padre;
      private List<Nodo> conexiones;

      public Nodo(String id, Nodo padre) {
          this.id = id;
          this.padre = padre;
          this.conexiones = new ArrayList<>();
      }

      public String getId() {
          return id;
      }

      public void setId(String id) {
          this.id = id;
      }

      public Nodo getPadre() {
          return padre;
      }

      public void setPadre(Nodo padre) {
          this.padre = padre;
      }

      public List<Nodo> getConexiones() {
          return conexiones;
      }

      public void setConexiones(List<Nodo> conexiones) {
          this.conexiones = conexiones;
      }

      public static String generarId(Nodo padre, int numeroHijo){

          if(padre == null)
              return String.valueOf(numeroHijo);

          return padre.id + "." + numeroHijo;
      }

      public void conectar(Nodo hijo){
          conexiones.add(hijo);
      }



      public void imprimir(String prefijo){

          System.out.print(prefijo + id+" ");
          System.out.println(this);
          System.out.println();

          for(Nodo hijo : conexiones){
              hijo.imprimir(prefijo + "   ");



          }
      }


  }
