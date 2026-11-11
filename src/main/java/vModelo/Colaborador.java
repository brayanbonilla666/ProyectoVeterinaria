/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vModelo;

    
public class Colaborador extends Persona{
    
    private String identificacion;

    public Colaborador(String nombre, String cedula, String email, String celular, String identificacion) {
        super(nombre, cedula, email, celular);
        this.identificacion = identificacion;
    }
    
    
}
