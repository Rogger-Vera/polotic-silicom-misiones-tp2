
package logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Mascota implements Serializable {
    
    //creamos un atributo id para identificar a cada cliente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    //dejamos el campo num_cliente ya que es un dato se encontraba en la imagen del formulario
    private int num_cliente;
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

    public Mascota() {
    }

    public Mascota(int id, int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.id = id;
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    
    
    
    
}
