
package vMain;

import vControlador.Controlador;
import vVista.VentanaPrincipal;
import vModelo.ModeloPrincipal;
import java.awt.EventQueue;
import java.beans.Visibility;

public class Main {
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(()-> {
            
            ModeloPrincipal modelo = new ModeloPrincipal();
            VentanaPrincipal vista = new VentanaPrincipal();
            Controlador controlador = new Controlador(modelo, vista);
            
            vista.setVisible(true);
            
        }
        
        
        
        );
    }
    
}
