
package logica;

import igu.Principal;
import persistencia.ControladorPersistencia;

public class Tpo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Controlador controlador = new Controlador();
        
        Principal principal = new Principal(controlador);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
    
}
