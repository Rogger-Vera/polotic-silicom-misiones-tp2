
package persistencia;

import java.util.List;
import logica.Mascota;

public class ControladorPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    //Solo se crea el metodo de alta ya que es lo unico solicitado por el cliente
    //Sin embargo existe la posibilidad de implementar otros metodos a futuro
    //metodo para alta
    public void crearMascota(Mascota mascota){
        mascotaJPA.create(mascota);
    }
    
    
    
}
