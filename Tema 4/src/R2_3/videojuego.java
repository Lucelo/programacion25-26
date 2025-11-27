package R2_3;

public class videojuego {

    public String nombre;

    public String compañía_creadora;

    public int Año;

    public int cpuCores;
    public int cpuSpeed;
    public int diskSpace;
    public int gpuCores;
    public int gpuMemory;

    videojuego(String nombre, String compañía_creadora, int Año) {
        this.nombre = nombre;
        this.compañía_creadora = compañía_creadora;
        this.Año = Año;

    }

    //
    public void requisitos(int cpuCores, int cpuSpeed, int diskSpace, int gpuCores, int gpuMemory) {
        this.cpuCores = cpuCores;
        this.cpuSpeed = cpuSpeed;
        this.diskSpace = diskSpace;
        this.gpuCores = gpuCores;
        this.gpuMemory = gpuMemory;
    }


}
