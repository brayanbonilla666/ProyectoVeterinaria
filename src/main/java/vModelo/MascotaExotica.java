
package vModelo;


public class MascotaExotica extends Animal{
    
    private String nPermiso;
    private boolean sedacion;

    public MascotaExotica(String nombre, String fechaNacimiento, double peso, Propietario propietario, HistorialClinico historialClinico, String nPermiso, boolean sedacion) {
        super(nombre, fechaNacimiento, peso, propietario, historialClinico);
        this.nPermiso = nPermiso;
        this.sedacion = sedacion;
    }
    
    
}
