
package vModelo;

public class MascotaConvencional extends Animal{
    
    private String raza;
    private int vacunas;

    public MascotaConvencional(String nombre, String fechaNacimiento, double peso, Propietario propietario, HistorialClinico historialClinico, String raza, int vacunas) {
        super(nombre, fechaNacimiento, peso, propietario, historialClinico);
        this.raza = raza;
        this.vacunas = vacunas;
    }
    
    
}
