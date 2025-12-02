package R2_8;

public class Equipo {

  public   String Nombre;

   public static int partidosGanados;

    Equipo (String nombre,int partidosGanados){
        this.Nombre= nombre;
        this.partidosGanados=partidosGanados;

    }

   public void sumarVictoria(){
        Equipo.partidosGanados+=1;
    }

  public String toString(){
       // System.out.println("El equipo"+ Equipo.Nombre+", ha ganado: "+ Equipo.partidosGanados);
      return null;
  }

}
