package pruebacorta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/* Anotaciones */
@XmlRootElement(name = "mascota") 
@XmlAccessorType(XmlAccessType.FIELD)

public class Mascota {
    private String nombre;
    private Integer edad;
    private String dueno;
    private String raza;
    private String vacuna;

    public Mascota(String nombre, Integer edad, String dueno, String raza, String vacuna) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
        this.raza = raza;
        this.vacuna = vacuna;
    }

    public Mascota(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", dueno=" + dueno + ", raza=" + raza + ", vacuna="
                + vacuna + "]";
    }

}
