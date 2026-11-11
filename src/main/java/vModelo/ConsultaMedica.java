
package vModelo;

import java.util.Date;

public class ConsultaMedica {
    
    private Date fecha;
    private Veterinario veterinario;
    private String Diagnostico;
    private boolean vacuna;
    private double tarifaBase;

    public ConsultaMedica(Date fecha, Veterinario veterinario, String Diagnostico, boolean vacuna, double tarifaBase) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.Diagnostico = Diagnostico;
        this.vacuna = vacuna;
        this.tarifaBase = tarifaBase;
    }
    
    
    
    public void calcularCostoTotal() {
        
    }
}
