package src.R2_3;

public class ordenador {

    public String nombre;

    public int cpuCores;
    public int cpuSpeed;
    public int diskSpace;
    public int gpuCores;
    public int gpuMemory;

    ordenador(String nombre, int cpuCores, int cpuSpeed, int diskSpace, int gpuCores, int gpuMemory) {
        this.nombre = nombre;
        this.cpuCores = cpuCores;
        this.cpuSpeed = cpuSpeed;
        this.diskSpace = diskSpace;
        this.gpuCores = gpuCores;
        this.gpuMemory = gpuMemory;

    }

}
