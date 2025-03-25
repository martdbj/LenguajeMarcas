package nofunciona;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mascotas")
@XmlAccessorType(XmlAccessType.FIELD)

public class Mascotas {
    @XmlElement(name = "mascota")

    private List<Mascota> Mascotas = null;

    public Mascotas(){}

    public List<Mascota> getMascotas() {
        return Mascotas;
    }

    @Override
    public String toString() {
        return "Mascotas [Mascotas=" + Mascotas + "]";
    }
}
