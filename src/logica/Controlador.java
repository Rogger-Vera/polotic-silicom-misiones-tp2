
package logica;

import persistencia.ControladorPersistencia;

public class Controlador {
    
    ControladorPersistencia controlPers = new ControladorPersistencia();
    
    public void crearMascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones){
        Mascota mascota = new Mascota();
        
        mascota.setNum_cliente(num_cliente + (int)(Math.random()*1000));
        mascota.setNombre_perro(nombre_perro);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencion_especial);
        mascota.setNombre_duenio(nombre_duenio);
        mascota.setCelular_duenio(celular_duenio);
        mascota.setObservaciones(observaciones);
        
        controlPers.crearMascota(mascota);
        
    }
    
    public void crearMascota(Mascota mascota){
        controlPers.crearMascota(mascota);
    }
    
    
    
}
