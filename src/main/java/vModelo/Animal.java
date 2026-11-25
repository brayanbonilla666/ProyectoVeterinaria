
package vModelo;

public class Animal {
    
    private String especie;
    private String nombre;
    private String fechaNacimiento;
    private double peso;
    private Propietario propietario;
    private HistorialClinico historialClinico;

    public Animal(String especie, String nombre, String fechaNacimiento, double peso, Propietario propietario, HistorialClinico historialClinico) {
        this.especie = especie;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.propietario = propietario;
        this.historialClinico = historialClinico;
    }
    
    
}
