package baroja.lenmar.tema4.XMLAnchan;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

 /*anotaciones */
    @XmlRootElement(name = "socio")
    //Usamos la propiedad
    @XmlType(propOrder = {"nombreSocio", "direccion", "fechaAlta"})
    @XmlAccessorType(XmlAccessType.FIELD)
public class Socio {
    @XmlAttribute(required = true)
    private Integer id;
    @XmlElement(name = "nombre")
    private String nombreSocio;
    @XmlElement(name = "socio")
    private String direccion;
    @XmlElement(name = "fechaAlata")
    private String fechaAlta;
    
    public Socio() {

    }

    public Socio(Integer id, String nombreSocio, String direccion, String fechaAlta) {
        this.id = id;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Socio [id=" + id + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta="
                + fechaAlta + "]";
    }
}
