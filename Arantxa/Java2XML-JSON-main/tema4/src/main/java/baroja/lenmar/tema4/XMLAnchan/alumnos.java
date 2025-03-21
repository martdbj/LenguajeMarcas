package baroja.lenmar.tema4.XMLAnchan;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="alumnos")
@XmlAccessorType (XmlAccessType.FIELD)

public class alumnos {

    @XmlElement(name="alumno")
    private List<Alumno> alumnos = null;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}
