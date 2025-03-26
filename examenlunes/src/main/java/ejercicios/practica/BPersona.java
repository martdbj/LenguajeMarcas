package ejercicios.practica;

import java.util.List;

public class BPersona {
    private String nombre;
    private String apelllidos;
    private int edad;
    List<String> aficiones;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApelllidos() {
        return apelllidos;
    }
    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public List<String> getAficiones() {
        return aficiones;
    }
    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }
    @Override
    public String toString() {
        return "BPersona [nombre=" + nombre + ", apelllidos=" + apelllidos + ", edad=" + edad + ", aficiones="
                + aficiones + "]";
    }    
}
