package R_8.vehiculos;

import java.util.Comparator;

public class ComparadorPorGama implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo veh1, Vehiculo veh2) {

        return veh1.getGama().compareTo(veh2.getGama());
    }

}
