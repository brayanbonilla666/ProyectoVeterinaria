
package vModelo;


public class MascotaExotica extends Animal{
    
    private String nPermiso;
    private boolean sedacion;

    public MascotaExotica(String especie, String nombre, String fechaNacimiento, double peso, Propietario propietario, HistorialClinico historialClinico, String nPermiso, boolean sedacion) {
        super(especie, nombre, fechaNacimiento, peso, propietario, historialClinico);
        this.nPermiso = nPermiso;
        this.sedacion = sedacion;
    }
    
    
}
