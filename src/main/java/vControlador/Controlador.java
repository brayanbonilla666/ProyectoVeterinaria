
package vControlador;

import vVista.VentanaPrincipal;
import vModelo.ModeloPrincipal;
import java.awt.event.ActionEvent;

public class Controlador {
    
    private ModeloPrincipal modelo;
    private VentanaPrincipal vista;

    public Controlador(ModeloPrincipal modelo, VentanaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
    }
    
    public void iniciar() {
        vista.setVisible(true);
    }
    
    
    
}
