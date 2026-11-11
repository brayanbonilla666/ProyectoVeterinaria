/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vModelo;

/**
 *
 * @author brayan
 */
public class Veterinario extends Colaborador{
    
    private String especialidad;
    private int nTarjeta;

    public Veterinario(String nombre, String cedula, String email, String celular, String identificacion, String especialidad, int nTarjeta) {
        super(nombre, cedula, email, celular, identificacion);
        this.especialidad = especialidad;
        this.nTarjeta = nTarjeta;
    }
    
    public void atenderConsulta() {
        
    }
    
    public void registrarDiagnostico() {
        
    }
}
